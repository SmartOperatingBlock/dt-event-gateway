/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package entities.events

import entities.events.EventProperties.EventKey

/**
 * The interface of a generic event.
 */
interface Event<out E> {

    /**
     * The key of the event. Every type of event has its unique key.
     */
    val key: EventKey

    /**
     * The data of the event.
     */
    val data: E

    /**
     * The date and time of the event.
     */
    val dateTime: String
}
