/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package infrastructure.digitaltwins.parser

import entities.environment.EnvironmentData.Humidity
import entities.environment.EnvironmentData.Luminosity
import entities.environment.EnvironmentData.LuminosityUnit
import entities.environment.EnvironmentData.Presence
import entities.environment.EnvironmentData.Temperature
import entities.environment.EnvironmentData.TemperatureUnit
import entities.events.EmptyEvent
import entities.events.Event
import entities.events.ProcessEvent
import entities.events.RoomEvent
import entities.process.PatientData.BodyTemperature
import entities.process.PatientData.DiastolicPressure
import entities.process.PatientData.Heartbeat
import entities.process.PatientData.PatientData
import entities.process.PatientData.RespiratoryRate
import entities.process.PatientData.Saturation
import entities.process.PatientData.SystolicPressure
import entities.process.ProcessData.MedicalTechnologyUsage
import entities.process.ProcessData.ProcessInfo
import infrastructure.digitaltwins.events.TwinProperties.DTModelID.MEDICAL_TECHNOLOGY_MODEL_ID
import infrastructure.digitaltwins.events.TwinProperties.DTModelID.OPERATING_ROOM_MODEL_ID
import infrastructure.digitaltwins.events.TwinProperties.DTModelID.PATIENT_MODEL_ID
import infrastructure.digitaltwins.events.TwinProperties.DTModelID.PRE_OPERATING_ROOM_MODEL_ID
import infrastructure.digitaltwins.events.TwinProperties.DTModelID.PROCESS_MODEL_ID
import infrastructure.digitaltwins.events.TwinProperties.PatientProperties.BODY_TEMPERATURE
import infrastructure.digitaltwins.events.TwinProperties.PatientProperties.DIASTOLIC_PRESSURE
import infrastructure.digitaltwins.events.TwinProperties.PatientProperties.HEARTBEAT
import infrastructure.digitaltwins.events.TwinProperties.PatientProperties.IS_ON_OPERATING_TABLE
import infrastructure.digitaltwins.events.TwinProperties.PatientProperties.RESPIRATORY_RATE
import infrastructure.digitaltwins.events.TwinProperties.PatientProperties.SATURATION_PERCENTAGE
import infrastructure.digitaltwins.events.TwinProperties.PatientProperties.SYSTOLIC_PRESSURE
import infrastructure.digitaltwins.events.TwinProperties.ProcessProperties.MEDICAL_TECHNOLOGY
import infrastructure.digitaltwins.events.TwinProperties.RoomProperties.HUMIDITY
import infrastructure.digitaltwins.events.TwinProperties.RoomProperties.LUMINOSITY
import infrastructure.digitaltwins.events.TwinProperties.RoomProperties.PRESENCE
import infrastructure.digitaltwins.events.TwinProperties.RoomProperties.TEMPERATURE
import infrastructure.digitaltwins.events.UpdateEvents
import infrastructure.kafka.EventProperties.EventKey

/**
 * The parser of Azure Digital Twins Update Events.
 */
class UpdateEventParser {

    /**
     * Manage the event of update of a Digital Twin.
     * @param updateTwinEvent the update event.
     * @return the specific [Event]
     */
    fun manageEvent(updateTwinEvent: UpdateEvents.UpdateTwinEvent): Event<Any> =
        when (updateTwinEvent.data.modelId) {
            OPERATING_ROOM_MODEL_ID.id, PRE_OPERATING_ROOM_MODEL_ID.id -> {
                manageRoomEvents(updateTwinEvent)
            }
            PATIENT_MODEL_ID.id, PROCESS_MODEL_ID.id, MEDICAL_TECHNOLOGY_MODEL_ID.id -> {
                manageProcessEvents(updateTwinEvent)
            }
            else -> EmptyEvent()
        }

    private fun manageRoomEvents(updateTwinEvent: UpdateEvents.UpdateTwinEvent): Event<Any> =
        when (updateTwinEvent.data.patch[0].path) {
            TEMPERATURE.path -> RoomEvent(
                key = EventKey.TEMPERATURE_EVENT,
                roomId = updateTwinEvent.id,
                data = Temperature((updateTwinEvent.data.patch[0].value as Number).toDouble(), TemperatureUnit.CELSIUS),
                dateTime = updateTwinEvent.eventDateTime
            )
            HUMIDITY.path -> RoomEvent(
                key = EventKey.HUMIDITY_EVENT,
                roomId = updateTwinEvent.id,
                data = Humidity(updateTwinEvent.data.patch[0].value as Int),
                dateTime = updateTwinEvent.eventDateTime
            )
            LUMINOSITY.path -> RoomEvent(
                key = EventKey.LUMINOSITY_EVENT,
                roomId = updateTwinEvent.id,
                data = Luminosity((updateTwinEvent.data.patch[0].value as Number).toDouble(), LuminosityUnit.LUX),
                dateTime = updateTwinEvent.eventDateTime
            )
            PRESENCE.path -> {
                RoomEvent(
                    key = EventKey.PRESENCE_EVENT,
                    roomId = updateTwinEvent.id,
                    data = Presence(updateTwinEvent.data.patch[0].value as Boolean),
                    dateTime = updateTwinEvent.eventDateTime
                )
            }
            else -> EmptyEvent()
        }

    private fun manageProcessEvents(updateTwinEvent: UpdateEvents.UpdateTwinEvent): Event<Any> =
        when (updateTwinEvent.data.patch[0].path) {
            IS_ON_OPERATING_TABLE.path -> {
                ProcessEvent(
                    key = EventKey.PATIENT_ON_OB_EVENT,
                    data = ProcessInfo("Patient on Operating Bed", updateTwinEvent.id),
                    dateTime = updateTwinEvent.eventDateTime
                )
            }
            BODY_TEMPERATURE.path -> {
                ProcessEvent(
                    key = EventKey.PATIENT_BODY_TEMPERATURE_UPDATE_EVENT,
                    data = PatientData(
                        updateTwinEvent.id,
                        BodyTemperature((updateTwinEvent.data.patch[0].value as Number).toDouble())
                    ),
                    dateTime = updateTwinEvent.eventDateTime
                )
            }
            DIASTOLIC_PRESSURE.path -> {
                ProcessEvent(
                    key = EventKey.PATIENT_DIASTOLIC_PRESSURE_UPDATE_EVENT,
                    data = PatientData(
                        updateTwinEvent.id,
                        DiastolicPressure(updateTwinEvent.data.patch[0].value as Int)
                    ),
                    dateTime = updateTwinEvent.eventDateTime
                )
            }
            SYSTOLIC_PRESSURE.path -> {
                ProcessEvent(
                    key = EventKey.PATIENT_SYSTOLIC_PRESSURE_UPDATE_EVENT,
                    data = PatientData(
                        updateTwinEvent.id,
                        SystolicPressure(updateTwinEvent.data.patch[0].value as Int)
                    ),
                    dateTime = updateTwinEvent.eventDateTime
                )
            }
            RESPIRATORY_RATE.path -> {
                ProcessEvent(
                    key = EventKey.PATIENT_RESPIRATORY_RATE_UPDATE_EVENT,
                    data = PatientData(
                        updateTwinEvent.id,
                        RespiratoryRate(updateTwinEvent.data.patch[0].value as Int)
                    ),
                    dateTime = updateTwinEvent.eventDateTime
                )
            }
            SATURATION_PERCENTAGE.path -> {
                ProcessEvent(
                    key = EventKey.PATIENT_SATURATION_UPDATE_EVENT,
                    data = PatientData(
                        updateTwinEvent.id,
                        Saturation(updateTwinEvent.data.patch[0].value as Int)
                    ),
                    dateTime = updateTwinEvent.eventDateTime
                )
            }
            HEARTBEAT.path -> {
                ProcessEvent(
                    key = EventKey.PATIENT_HEARTBEAT_UPDATE_EVENT,
                    data = PatientData(
                        updateTwinEvent.id,
                        Heartbeat(updateTwinEvent.data.patch[0].value as Int)
                    ),
                    dateTime = updateTwinEvent.eventDateTime
                )
            }
            MEDICAL_TECHNOLOGY.path -> {
                ProcessEvent(
                    key = EventKey.MEDICAL_TECHNOLOGY_USAGE_EVENT,
                    data = MedicalTechnologyUsage(
                        updateTwinEvent.id,
                        updateTwinEvent.data.patch[0].value as Boolean
                    ),
                    dateTime = updateTwinEvent.eventDateTime
                )
            }
            else -> EmptyEvent()
        }
}
