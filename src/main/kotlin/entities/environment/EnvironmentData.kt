/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package entities.environment

/**
 * The object with all the environment data for the operating block rooms events.
 */
object EnvironmentData {

    /**
     * The humidity of the room.
     * @param humidityPercentage the percentage of humidity.
     */
    data class Humidity(val humidityPercentage: Int)

    /**
     * The temperature of the room.
     * @param temperatureValue the temperature of the room.
     */
    data class Temperature(val temperatureValue: Double)

    /**
     * The luminosity of the room.
     * @param luminosityValue the luminosity value of the room.
     */
    data class Luminosity(val luminosityValue: Double)

    /**
     * The presence of a person inside the room.
     * @param presenceDetected true if is a person detection event, false otherwise.
     */
    data class Presence(val presenceDetected: Boolean)

}
