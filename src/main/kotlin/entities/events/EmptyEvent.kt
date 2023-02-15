/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package entities.events

/**
 * The event sent when the input has not to be propagated to the microservices.
 */
data class EmptyEvent(override val key: String = "EMPTY_EVENT", override val data: Any = "EMPTY_DATA" ) : Event<Any>
