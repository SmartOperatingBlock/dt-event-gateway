/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package application.presenter

import entities.events.Event

/**
 * The parser has the responsibility to parse the input event in order to propagate the correct event to microservices.
 */
interface EventParser<in E> {

    /**
     * The function to parse the event.
     * @param inputEvent the input event.
     */
    fun parseEvent(inputEvent: E): Event<Any>
}
