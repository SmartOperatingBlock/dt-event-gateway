/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

plugins {
    application
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.qa)
    alias(libs.plugins.dokka)
    alias(libs.plugins.kotlin.serialization)
}

group = "io.github.smartoperatingblock"

repositories {
    mavenCentral()
    maven {
        url = uri("https://packages.confluent.io/maven")
    }
}

dependencies {
    implementation(libs.kotlin.stdlib)
    implementation(libs.kafka.clients)
    implementation(libs.kafka.streams)
    implementation(libs.kafka.connect)
    implementation(libs.kafka.json)
    implementation(libs.kafka.streams.json.serde)
    implementation(libs.logback)
    implementation(libs.signalr)
    testImplementation(libs.bundles.kotlin.testing)
}

kotlin {
    target {
        compilations.all {
            kotlinOptions {
                allWarningsAsErrors = true
            }
        }
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
    testLogging {
        showStandardStreams = true
        showCauses = true
        showStackTraces = true
        events(*org.gradle.api.tasks.testing.logging.TestLogEvent.values())
        exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
    }
}
