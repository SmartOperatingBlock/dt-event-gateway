/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package entities.surgery

/**
 * The object with all the data for the surgical booking events.
 */
object SurgeryBookingData {

    /** The booking of a surgery in a specific [surgeryDate] and of a specific [surgeryType]. */
    data class SurgeryBooking(val surgeryDate: String, val surgeryType: String)
}
