/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package infrastructure.signalr

import application.presenter.EventConsumer
import application.presenter.EventParser
import com.microsoft.signalr.HubConnection
import com.microsoft.signalr.HubConnectionBuilder
import com.microsoft.signalr.HubConnectionState
import entities.events.EmptyEvent
import entities.events.Event
import infrastructure.digitaltwins.parser.DTEventParser
import io.reactivex.rxjava3.core.FlowableEmitter

/**
 * The consumer of events from a SignalR topic.
 */
class SignalRClient : EventConsumer<String> {

    init {
        requireNotNull(System.getenv("SIGNALR_CONNECTION_STRING")) {
            println("Invalid connection String: please provide a valid connection String!")
        }
    }

    private val connection = HubConnectionBuilder.create(System.getenv("SIGNALR_CONNECTION_STRING")).build()
    private val eventParser: EventParser<String> = DTEventParser()

    override fun start(emitter: FlowableEmitter<Event<Any>>) {
        connection.on("newMessage", {
            val event = consumeEvent(it)
            if (event !is EmptyEvent) {
                emitter.onNext(event)
            }
        }, String::class.java)
        connection.persistentStart()
    }

    override fun consumeEvent(inputEvent: String): Event<Any> = eventParser.parseEvent(inputEvent)

    private fun HubConnection.persistentStart() {
        this.start().blockingAwait()
        this.onClosed {
            if (this.connectionState == HubConnectionState.DISCONNECTED) {
                this.persistentStart()
            }
        }
    }
}
