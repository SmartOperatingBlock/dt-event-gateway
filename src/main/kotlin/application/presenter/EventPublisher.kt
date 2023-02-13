/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package application.presenter

import entities.events.Event

/**
 * The publisher of events to the microservices.
 */
interface EventPublisher<in E : Event<Any>> {

    /**
     * Publish the event.
     * It's independent on the output publishing platform.
     * @param event the event to publish.
     */
    fun publishEvent(event: E)

}
