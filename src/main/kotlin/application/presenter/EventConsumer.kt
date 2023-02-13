/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package application.presenter

import entities.events.Event
import io.reactivex.rxjava3.core.FlowableEmitter

/**
 * The consumer of events.
 * It's responsible to consume events and to emit them to an Observer.
 */
interface EventConsumer<in E> {

    /**
     * The function to start the consumer.
     * @param emitter the emitter of events.
     */
    fun start(emitter: FlowableEmitter<Event<Any>>)

    /**
     * The function fon consuming events.
     * @param inputEvent the input event.
     * @return the parsed Event.
     */
    fun consumeEvent(inputEvent: E): Event<*>
}
