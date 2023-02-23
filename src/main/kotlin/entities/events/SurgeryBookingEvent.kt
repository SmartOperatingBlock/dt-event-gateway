/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package entities.events

/**
 * The event of a surgery booking.
 */
data class SurgeryBookingEvent<E : Any> (

    override val key: String = "SURGERY_BOOKING_EVENT",

    override val data: E,

    override val dateTime: String
) : Event<E>
