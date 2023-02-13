import entities.events.Event
import application.presenter.EventConsumer
import application.presenter.EventPublisher
import application.services.EventService
import infrastructure.kafka.KafkaPublisher
import infrastructure.signalr.SignalRClient


/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

/**
 * The application launcher.
 */
fun main() {

    val publisher: EventPublisher<Event<Any>> = KafkaPublisher()
    val consumer: EventConsumer<String> = SignalRClient()

    val service: EventService<String> = EventService(publisher, consumer)
    service.start()
}
