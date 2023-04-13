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
 * The event of health professionals tracking inside the operating block rooms.
 */
data class TrackingEvent<E : Any> (

    override val key: EventKey = EventKey.TRACKING_EVENT,

    /**
     * The health professional ID.
     */
    val healthProfessionalId: String,

    /**
     * The room ID.
     */
    val roomId: String,

    override val data: E,

    override val dateTime: String,

) : Event<E>
