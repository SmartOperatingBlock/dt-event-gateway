/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package entities.process

/**
 * The object with all the data for the patient events.
 */
object PatientData {

    /**
     * The [data] of the patient identified by [patientId].
     */
    data class PatientData<E>(val patientId: String, val data: E)

    /**
     * The body [temperature] of the patient.
     */
    data class BodyTemperature(val temperature: Double)

    /**
     * The [heartbeat] of the patient.
     */
    data class Heartbeat(val heartbeat: Int)

    /**
     * The diastolic [pressure] of the patient.
     */
    data class DiastolicPressure(val pressure: Int)

    /**
     * The systolic [pressure] of the patient.
     */
    data class SystolicPressure(val pressure: Int)

    /**
     * The [rate] of respiration the patient.
     */
    data class RespiratoryRate(val rate: Int)

    /**
     * The [saturation] of the patient oxygen.
     */
    data class Saturation(val saturation: Int)
}
