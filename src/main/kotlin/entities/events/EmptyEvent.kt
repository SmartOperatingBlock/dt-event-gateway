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
 * The event sent when the input has not to be propagated to the microservices.
 */
data class EmptyEvent(
    override val key: EventKey = EventKey.EMPTY_EVENT,
    override val data: Any = "EMPTY_DATA",
    override val dateTime: String = "EMPTY_DATA",
) : Event<Any>
