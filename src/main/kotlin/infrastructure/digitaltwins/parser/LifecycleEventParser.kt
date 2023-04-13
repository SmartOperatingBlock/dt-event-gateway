/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package infrastructure.digitaltwins.parser

import entities.events.EmptyEvent
import entities.events.Event
import entities.events.SurgeryBookingEvent
import entities.surgery.SurgeryBookingData.SurgeryBooking
import infrastructure.digitaltwins.events.LifecycleEvents.LifecycleEvent
import infrastructure.digitaltwins.events.TwinProperties.DTEventTypes.CREATE
import infrastructure.digitaltwins.events.TwinProperties.DTModelID.SURGERY_BOOKING_MODEL_ID

/**
 * The parser of Azure Digital Twins Lifecycle Events.
 */
class LifecycleEventParser {

    /**
     * Manage the event of create and delete of a Digital Twin.
     * @param lifecycleTwinEvent the update event.
     * @return the specific [Event]
     */
    fun manageEvent(lifecycleTwinEvent: LifecycleEvent): Event<Any> =
        when (lifecycleTwinEvent.model) {
            SURGERY_BOOKING_MODEL_ID.id -> manageSurgeryBookingEvents(lifecycleTwinEvent)
            else -> EmptyEvent()
        }

    private fun manageSurgeryBookingEvents(lifecycleTwinEvent: LifecycleEvent): Event<Any> =
        when (lifecycleTwinEvent.eventType) {
            CREATE.type -> {
                SurgeryBookingEvent(
                    data = SurgeryBooking(
                        lifecycleTwinEvent.data["booking_date_time"].toString(),
                        lifecycleTwinEvent.data["surgery_type"].toString(),
                    ),
                    dateTime = lifecycleTwinEvent.eventDateTime,
                )
            }
            else -> EmptyEvent()
        }
}
