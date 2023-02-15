/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package infrastructure.digitaltwins

import application.presenter.EventParser
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import entities.environment.EnvironmentData.Humidity
import entities.environment.EnvironmentData.Luminosity
import entities.environment.EnvironmentData.Presence
import entities.environment.EnvironmentData.Temperature
import entities.events.EmptyEvent
import entities.events.Event
import entities.events.ProcessEvent
import entities.events.RoomEvent
import entities.events.TrackingEvent
import entities.process.ProcessData.MedicalDeviceUsage
import entities.process.ProcessData.ProcessInfo
import infrastructure.digitaltwins.events.RelationshipEvents.RelationshipEvent
import infrastructure.digitaltwins.events.UpdateEvents.UpdateTwinEvent

/**
 * The parser of Azure Digital Twins Events.
 */
class DTEventParser : EventParser<String> {

    override fun parseEvent(inputEvent: String): Event<Any> {
        val mapper = jacksonObjectMapper()
        val eventMap = mapper.readValue<MutableMap<Any, Any>>(inputEvent)
        return when (eventMap["eventType"]) {
            "Microsoft.DigitalTwins.Twin.Update" -> {
                manageUpdateTwinEvent(
                    mapper.readValue(inputEvent, UpdateTwinEvent::class.java)
                )
            }

            "Microsoft.DigitalTwins.Relationship.Create" -> {
                manageRelationshipCreationEvent(
                    mapper.readValue(inputEvent.replace("$", ""), RelationshipEvent::class.java)
                )
            }

            "Microsoft.DigitalTwins.Relationship.Delete" -> {
                manageRelationshipDeleteEvent(
                    mapper.readValue(inputEvent.replace("$", ""), RelationshipEvent::class.java)
                )
            }

            else -> EmptyEvent()
        }
    }

    private fun manageUpdateTwinEvent(updateTwinEvent: UpdateTwinEvent): Event<Any> =
        when (updateTwinEvent.data.patch[0].path) {
            "/temperature" -> RoomEvent(
                roomId = updateTwinEvent.id,
                data = Temperature(updateTwinEvent.data.patch[0].value as Double),
                dateTime = updateTwinEvent.eventDateTime
            )
            "/humidity" -> RoomEvent(
                roomId = updateTwinEvent.id,
                data = Humidity(updateTwinEvent.data.patch[0].value as Int),
                dateTime = updateTwinEvent.eventDateTime
            )
            "/luminosity" -> RoomEvent(
                roomId = updateTwinEvent.id,
                data = Luminosity(updateTwinEvent.data.patch[0].value as Double),
                dateTime = updateTwinEvent.eventDateTime
            )
            "/presence_inside" -> {
                RoomEvent(
                    roomId = updateTwinEvent.id,
                    data = Presence(updateTwinEvent.data.patch[0].value as Boolean),
                    dateTime = updateTwinEvent.eventDateTime
                )
            }
            "/is_on_operating_table" -> {
                ProcessEvent(
                    data = ProcessInfo("Patient on Operating Bed", updateTwinEvent.id),
                    dateTime = updateTwinEvent.eventDateTime
                )
            }
            else -> EmptyEvent()
        }

    private fun manageRelationshipCreationEvent(createdRelationship: RelationshipEvent): Event<Any> =
        when (createdRelationship.data.relationshipName) {
            "rel_is_inside" -> TrackingEvent(
                healthProfessionalId = createdRelationship.data.sourceId,
                roomId = createdRelationship.data.targetId,
                data = true,
                dateTime = createdRelationship.eventDateTime
            )
            "rel_use" -> ProcessEvent(
                data = MedicalDeviceUsage(createdRelationship.data.targetId, createdRelationship.data.sourceId),
                dateTime = createdRelationship.eventDateTime
            )
            else -> EmptyEvent()
        }

    private fun manageRelationshipDeleteEvent(deletedRelationship: RelationshipEvent): Event<Any> =
        when (deletedRelationship.data.relationshipName) {
            "rel_is_inside" -> TrackingEvent(
                healthProfessionalId = deletedRelationship.data.sourceId,
                roomId = deletedRelationship.data.targetId,
                data = false,
                dateTime = deletedRelationship.eventDateTime
            )
            else -> EmptyEvent()
        }
}
