/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package entities.events

/** Module with some event properties. */
object EventProperties {

    /** The name of the topic for process events. */
    const val processEvents = "process-events"

    /** The name of the topic for room events. */
    const val roomEvents = "room-events"

    /** The name of the topic for tracking events. */
    const val trackingEvents = "tracking-events"

    /** The name of the topic for booking events. */
    const val bookingEvents = "surgery-booking-events"

    /** The keys of the events and the [topicName] on which publish the event . */
    enum class EventKey(val topicName: String) {
        MEDICAL_DEVICE_USAGE_EVENT(processEvents),
        MEDICAL_TECHNOLOGY_USAGE_EVENT(processEvents),
        TEMPERATURE_EVENT(roomEvents),
        HUMIDITY_EVENT(roomEvents),
        LUMINOSITY_EVENT(roomEvents),
        PRESENCE_EVENT(roomEvents),
        PATIENT_ON_OB_EVENT(processEvents),
        PATIENT_BODY_TEMPERATURE_UPDATE_EVENT(processEvents),
        PATIENT_DIASTOLIC_PRESSURE_UPDATE_EVENT(processEvents),
        PATIENT_SYSTOLIC_PRESSURE_UPDATE_EVENT(processEvents),
        PATIENT_RESPIRATORY_RATE_UPDATE_EVENT(processEvents),
        PATIENT_SATURATION_UPDATE_EVENT(processEvents),
        PATIENT_HEARTBEAT_UPDATE_EVENT(processEvents),
        EMPTY_EVENT(""),
        PATIENT_TRACKED_EVENT(processEvents),
        TRACKING_EVENT(trackingEvents),
        SURGERY_BOOKINGS_EVENT(bookingEvents),
    }
}
