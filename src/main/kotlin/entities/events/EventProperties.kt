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

    /** The keys of the events and the [topicName] on which publish the event . */
    enum class EventKey(val topicName: String) {
        MEDICAL_DEVICE_USAGE_EVENT("process-events"),
        MEDICAL_TECHNOLOGY_USAGE_EVENT("process-events"),
        TEMPERATURE_EVENT("room-events"),
        HUMIDITY_EVENT("room-events"),
        LUMINOSITY_EVENT("room-events"),
        PRESENCE_EVENT("room-events"),
        PATIENT_ON_OB_EVENT("process-events"),
        PATIENT_BODY_TEMPERATURE_UPDATE_EVENT("process-events"),
        PATIENT_DIASTOLIC_PRESSURE_UPDATE_EVENT("process-events"),
        PATIENT_SYSTOLIC_PRESSURE_UPDATE_EVENT("process-events"),
        PATIENT_RESPIRATORY_RATE_UPDATE_EVENT("process-events"),
        PATIENT_SATURATION_UPDATE_EVENT("process-events"),
        PATIENT_HEARTBEAT_UPDATE_EVENT("process-events"),
        EMPTY_EVENT(""),
        PATIENT_TRACKED_EVENT("process-events"),
        TRACKING_EVENT("tracking-events"),
        SURGERY_BOOKINGS_EVENT("surgery-bookings-events")
    }
}
