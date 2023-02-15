/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package infrastructure.digitaltwins.events

/**
 * The model of Azure Digital Twins Relationship Events.
 */
object RelationshipEvents {

    /**
     * The section data of DT relationship events.
     */
    data class RelationshipEventData(
        /**
         * The id of the relationship.
         */
        val relationshipId: String,
        /**
         * The DT etag.
         */
        val etag: String,
        /**
         * The source ID of the DT.
         */
        val sourceId: String,
        /**
         * The name of the relationship.
         */
        val relationshipName: String,
        /**
         * The target id of the relationship.
         */
        val targetId: String,

        /**
         * The model of the relationship source.
         */
        val sourceModel: String
    )

    /**
     * The event of creation or delete of a relationship between DT.
     */
    data class RelationshipEvent(

        /** The section data. **/
        val data: RelationshipEventData,
        /**
         * The type of the event.
         */
        val contenttype: String,
        /**
         * The trace parent of the event.
         */
        val traceparent: String,
        /**
         * The id of the event.
         */
        val id: String,
        /**
         * The type of the event.
         */
        val eventType: String,
        /**
         * The date and time of the event.
         */
        val eventDateTime: String
    )
}
