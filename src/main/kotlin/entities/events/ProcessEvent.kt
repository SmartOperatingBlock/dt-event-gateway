/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package entities.events

import entities.events.EventProperties.EventKey

/**
 * The event of change of state in the surgical process.
 */
data class ProcessEvent<E : Any>(

    override val key: EventKey,

    override val data: E,

    override val dateTime: String,

) : Event<E>
