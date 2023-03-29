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
     * @param processId the id of the surgical process.
     */
    data class MedicalDeviceUsage(val medicalDeviceID: String, val processId: String)

    /**
     * The event of patient on operating table.
     * @param processId the id of the surgical process.
     */
    data class PatientOnOperatingTable(val processId: String)

    /**
     * The event of medical technology usage given its [medicalTechnologyID].
     * @param inUse true if the medical technology is in use, false otherwise.
     */
    data class MedicalTechnologyUsage(val medicalTechnologyID: String, val inUse: Boolean)

    /**
     * The event of patient tracking inside the operating block.
     * @param patientId the id of the patient.
     * @param roomId the id of the room.
     * @param entered true if is entered in the room, false otherwise.
     * @param roomType the type of the room.
     */
    data class PatientTracked(
        val patientId: String,
        val roomId: String,
        val entered: Boolean,
        val roomType: RoomType
    )

    /** The type of the room where the patient is tracked. **/
    enum class RoomType {
        PRE_OPERATING_ROOM, OPERATING_ROOM
    }
}
