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
import entities.events.EventProperties.EventKey
import entities.events.ProcessEvent
import entities.events.TrackingEvent
import entities.process.ProcessData
import entities.process.ProcessData.RoomType.OPERATING_ROOM
import entities.process.ProcessData.RoomType.PRE_OPERATING_ROOM
import infrastructure.digitaltwins.events.RelationshipEvents
import infrastructure.digitaltwins.events.TwinProperties.DTModelID.HEALTH_PROFESSIONAL_MODEL_ID
import infrastructure.digitaltwins.events.TwinProperties.DTModelID.PATIENT_MODEL_ID
import infrastructure.digitaltwins.events.TwinProperties.DTModelID.PRE_OPERATING_ROOM_MODEL_ID
import infrastructure.digitaltwins.events.TwinProperties.DTModelID.PROCESS_MODEL_ID

/**
 * The parser of Azure Digital Twins Relationship Events.
 */
class RelationshipEventParser {

    /**
     * Manage the event of creation of a relationship between Digital Twins.
     * @param createdRelationship the relationship.
     *@return the specific [Event].
     */
    fun manageCreatedRelationship(createdRelationship: RelationshipEvents.RelationshipEvent): Event<Any> =
        when (createdRelationship.data.sourceModel) {
            HEALTH_PROFESSIONAL_MODEL_ID.id -> {
                when (createdRelationship.data.relationshipName) {
                    "rel_is_inside" -> TrackingEvent(
                        healthProfessionalId = createdRelationship.data.sourceId,
                        roomId = createdRelationship.data.targetId,
                        data = true,
                        dateTime = createdRelationship.eventDateTime,
                    )
                    else -> EmptyEvent()
                }
            }
            PATIENT_MODEL_ID.id -> {
                when (createdRelationship.data.relationshipName) {
                    "rel_is_inside" -> ProcessEvent(
                        key = EventKey.PATIENT_TRACKED_EVENT,
                        data = ProcessData.PatientTracked(
                            patientId = createdRelationship.data.sourceId,
                            roomId = createdRelationship.data.targetId,
                            entered = true,
                            roomType =
                            if (createdRelationship.data.targetModel == PRE_OPERATING_ROOM_MODEL_ID.id) {
                                PRE_OPERATING_ROOM
                            } else {
                                OPERATING_ROOM
                            },
                        ),
                        dateTime = createdRelationship.eventDateTime,
                    )
                    else -> EmptyEvent()
                }
            }
            PROCESS_MODEL_ID.id -> {
                when (createdRelationship.data.relationshipName) {
                    "rel_use" -> ProcessEvent(
                        key = EventKey.MEDICAL_DEVICE_USAGE_EVENT,
                        data = ProcessData.MedicalDeviceUsage(
                            createdRelationship.data.targetId,
                            createdRelationship.data.sourceId,
                        ),
                        dateTime = createdRelationship.eventDateTime,
                    )
                    else -> EmptyEvent()
                }
            }
            else -> EmptyEvent()
        }

    /**
     * Manage the event of delete of a relationship between Digital Twins.
     * @param deletedRelationship the relationship.
     *@return the specific [Event]
     */
    fun manageDeletedRelationship(deletedRelationship: RelationshipEvents.RelationshipEvent): Event<Any> =
        when (deletedRelationship.data.relationshipName) {
            "rel_is_inside" -> {
                when (deletedRelationship.data.sourceModel) {
                    HEALTH_PROFESSIONAL_MODEL_ID.id -> {
                        TrackingEvent(
                            healthProfessionalId = deletedRelationship.data.sourceId,
                            roomId = deletedRelationship.data.targetId,
                            data = false,
                            dateTime = deletedRelationship.eventDateTime,
                        )
                    }
                    PATIENT_MODEL_ID.id -> {
                        ProcessEvent(
                            key = EventKey.PATIENT_TRACKED_EVENT,
                            data = ProcessData.PatientTracked(
                                patientId = deletedRelationship.data.sourceId,
                                roomId = deletedRelationship.data.targetId,
                                entered = false,
                                roomType =
                                if (deletedRelationship.data.targetModel == PRE_OPERATING_ROOM_MODEL_ID.id) {
                                    PRE_OPERATING_ROOM
                                } else {
                                    OPERATING_ROOM
                                },
                            ),
                            dateTime = deletedRelationship.eventDateTime,
                        )
                    }
                    else -> EmptyEvent()
                }
            }
            else -> EmptyEvent()
        }
}
