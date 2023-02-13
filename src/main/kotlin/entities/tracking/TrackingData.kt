/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package entities.tracking

/**
 * The object with all the data for the tracking of health professionals.
 */
object TrackingData {

    /**
     * The data for the tracking of a person.
     * @param tracked true if the person is tracked in a room, false if it's no more in the room.
     */
    data class PersonTracked(val tracked: Boolean)
}
