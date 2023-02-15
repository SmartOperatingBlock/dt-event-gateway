/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package infrastructure.digitaltwins.events

/**
 * The model of Azure Digital Twins Lifecycle events.
 */
object LifecycleEvents {

    /**
     * The date section for lifecycle events.
     */
    data class LifecycleEventData(
        /**
         * The DT id.
         */
        val dtId: String,
        /**
         * The DT etag.
         */
        val etag: String,
        /**
         * The metadata of the DT.
         */
        val metadata: LifecycleMetadata
    )

    /**
     * The metadata of the DT.
     */
    data class LifecycleMetadata(
        /**
         * The model of the DT.
         */
        val model: String
    )

    /**
     * The event of creation or delete of a DT.
     */
    data class LifecycleEvent(
        /**
         * The data section of the event.
         */
        val data: LifecycleEventData,
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
