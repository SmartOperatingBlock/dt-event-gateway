/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package infrastructure.digitaltwins.parser

import application.presenter.EventParser
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import entities.events.EmptyEvent
import entities.events.Event
import infrastructure.digitaltwins.events.LifecycleEvents.LifecycleEvent
import infrastructure.digitaltwins.events.RelationshipEvents.RelationshipEvent
import infrastructure.digitaltwins.events.TwinProperties.DTEventTypes.CREATE
import infrastructure.digitaltwins.events.TwinProperties.DTEventTypes.RELATIONSHIP_CREATE
import infrastructure.digitaltwins.events.TwinProperties.DTEventTypes.RELATIONSHIP_DELETE
import infrastructure.digitaltwins.events.TwinProperties.DTEventTypes.UPDATE
import infrastructure.digitaltwins.events.UpdateEvents.UpdateTwinEvent

/**
 * The parser of Azure Digital Twins Events.
 */
class DTEventParser : EventParser<String> {

    private val updateEventParser = UpdateEventParser()
    private val relationshipEventParser = RelationshipEventParser()
    private val lifecycleEventParser = LifecycleEventParser()

    override fun parseEvent(inputEvent: String): Event<Any> {
        val mapper = jacksonObjectMapper()
        val eventMap = mapper.readValue<MutableMap<Any, Any>>(inputEvent)
        return when (eventMap["eventType"]) {
            UPDATE.type -> {
                updateEventParser.manageEvent(
                    mapper.readValue(inputEvent, UpdateTwinEvent::class.java)
                )
            }
            CREATE.type -> {
                lifecycleEventParser.manageEvent(
                    mapper.readValue(inputEvent.replace("$", ""), LifecycleEvent::class.java)
                )
            }
            RELATIONSHIP_CREATE.type -> {
                relationshipEventParser.manageCreatedRelationship(
                    mapper.readValue(inputEvent.replace("$", ""), RelationshipEvent::class.java)
                )
            }
            RELATIONSHIP_DELETE.type -> {
                relationshipEventParser.manageDeletedRelationship(
                    mapper.readValue(inputEvent.replace("$", ""), RelationshipEvent::class.java)
                )
            }
            else -> EmptyEvent()
        }
    }
}
