/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package instracture.parser

import infrastructure.digitaltwins.parser.DTEventParser
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

/**
 * Test the parsing of Digital Twin Events.
 */
class TestEventParser : StringSpec({

    val parser = DTEventParser()

    val temperatureUpdateEvent = readFileFromResources("/SampleTemperatureUpdateEvent.json")
    val humidityUpdateEvent = readFileFromResources("/SampleHumidityUpdateEvent.json")
    val luminosityUpdateEvent = readFileFromResources("/SampleLuminosityUpdateEvent.json")
    val trackingEvent = readFileFromResources("/SampleTrackingEvent.json")

    "DT parser should parse room event of temperature update" {
        val event = parser.parseEvent(temperatureUpdateEvent)
        event shouldNotBe null
        event.key shouldBe "ROOM_EVENT"
    }

    "DT parser should parse room event of humidity update" {
        val event = parser.parseEvent(humidityUpdateEvent)
        event shouldNotBe null
        event.key shouldBe "ROOM_EVENT"
    }

    "DT parser should parse room event of luminosity update" {
        val event = parser.parseEvent(luminosityUpdateEvent)
        event shouldNotBe null
        event.key shouldBe "ROOM_EVENT"
    }

    "DT parser should parse tracking event" {
        val event = parser.parseEvent(trackingEvent)
        event shouldNotBe null
        event.key shouldBe "TRACKING_EVENT"
    }
})

fun readFileFromResources(path: String): String =
    object {}.javaClass.getResource(path)!!.readText()
