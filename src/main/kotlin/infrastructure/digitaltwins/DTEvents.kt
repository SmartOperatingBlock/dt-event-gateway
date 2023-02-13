/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package infrastructure.digitaltwins

/**
 * Contains all the possible events received from Azure Digital Twins.
 * The events are used by the @[DTEventParser] to successfully deserialize events.
 */
object DTEvents {

    /**
     * The patch section of the DT event.
     */
    data class Patch(
        /**
         * The updated value.
         */
        val value: Any,
        /**
         * The path of the operation.
         */
        val path: String,
        /**
         * The type of operation on the value.
         */
        val op: String,
    )

    /**
     * The data section of the update DT event.
     */
    data class UpdateData(
        /**
         * The model ID.
         */
        val modelId: String,
        /**
         * The patch section.
         */
        val patch: List<Patch>,
   )

    /**
     * The event of update of a DT.
     */
   data class UpdateTwinEvent(
        /**
         * The data section of the event.
         */
        val data: UpdateData,
        /**
         * The type of the event.
         */
        val contenttype: String,
        /**
         * The trace parent.
         */
        val traceparent: String,
        /**
         * The id of event.
         */
        val id: String,
        /**
         * The type of the event.
         */
        val eventType: String,
        /**
         * The date and time of the event.
         */
        val eventDateTime: String,
   )
}
