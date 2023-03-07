/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package infrastructure.kafka

/** Module with some event properties. */
object EventProperties {

    /** The keys of the events. */
    enum class EventKeys {
        MEDICAL_DEVICE_USAGE_EVENT,
        MEDICAL_TECHNOLOGY_USAGE_EVENT,
        TEMPERATURE_EVENT,
        HUMIDITY_EVENT,
        LUMINOSITY_EVENT,
        PRESENCE_EVENT,
        PATIENT_ON_OB_EVENT,
        PATIENT_BODY_TEMPERATURE_UPDATE_EVENT,
        PATIENT_DIASTOLIC_PRESSURE_UPDATE_EVENT,
        PATIENT_SYSTOLIC_PRESSURE_UPDATE_EVENT,
        PATIENT_RESPIRATORY_RATE_UPDATE_EVENT,
        PATIENT_SATURATION_UPDATE_EVENT,
        PATIENT_HEARTBEAT_UPDATE_EVENT
    }
}
