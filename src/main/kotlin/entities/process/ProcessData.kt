/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package entities.process

/**
 * The object with all the data for the surgical process events.
 */
object ProcessData {

    /**
     * The medical device used in the surgical process.
     * @param medicalDeviceID the id of the technology.
     */
    data class MedicalDeviceUsage(val medicalDeviceID: String)

    /**
     * A state of the surgical process.
     * @param state the current state of the process.
     */
    data class ProcessState(val state: String)

}
