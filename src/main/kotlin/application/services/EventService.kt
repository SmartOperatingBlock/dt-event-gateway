/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package application.services

import application.presenter.EventConsumer
import application.presenter.EventPublisher
import entities.events.Event
import io.reactivex.rxjava3.core.BackpressureStrategy
import io.reactivex.rxjava3.core.Flowable

/**
 * The Application service responsible to start the consumer and to propagate the events to the publisher.
 */
class EventService<in C>(
    private val eventPublisher: EventPublisher<Event<Any>>,
    private val eventConsumer: EventConsumer<C>
) {

    /**
     * Start the event service.
     */
    fun start(){
        Flowable.create({ emitter ->
            eventConsumer.start(emitter)
        }, BackpressureStrategy.BUFFER).subscribe { event ->
            eventPublisher.publishEvent(event)
        }
    }

}
