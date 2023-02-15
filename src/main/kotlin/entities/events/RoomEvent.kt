/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package entities.events

/**
 * The event of change of humidity in a room of the operating block.
 */
data class RoomEvent<E : Any> (

    override val key: String = "ROOM_EVENT",
    /**
     * The room ID.
     */
    val roomId: String,

    override val data: E,

    override val dateTime: String

) : Event<E>
