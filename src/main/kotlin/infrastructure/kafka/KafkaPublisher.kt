/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package infrastructure.kafka

import application.presenter.EventPublisher
import entities.events.Event
import io.confluent.kafka.serializers.KafkaJsonSerializer
import org.apache.kafka.clients.producer.KafkaProducer
import org.apache.kafka.clients.producer.ProducerRecord

/**
 * The publisher of events to a Kafka Event Broker.
 */
class KafkaPublisher : EventPublisher<Event<*>> {

    init {
        listOf(System.getenv("BOOTSTRAP_SERVER_URL"), System.getenv("SCHEMA_REGISTRY_URL")).forEach {
            requireNotNull(it) {
                println(
                    """
                    Invalid environment variable!
                    Check the documentation here:
                    https://github.com/SmartOperatingBlock/bootstrap")"""
                        .trimIndent()
                )
            }
        }
    }

    private val producerProps = mapOf(
        "bootstrap.servers" to System.getenv("BOOTSTRAP_SERVER_URL"),
        "schema.registry.url" to System.getenv("SCHEMA_REGISTRY_URL"),
        "key.serializer" to "org.apache.kafka.common.serialization.StringSerializer",
        "value.serializer" to KafkaJsonSerializer::class.java
    )

    private val eventToTopic: Map<String, String> = mapOf(
        "ROOM_EVENT" to "room-events",
        "PROCESS_EVENT" to "process-events",
        "TRACKING_EVENT" to "tracking-events",
        "SURGERY_BOOKING_EVENT" to "surgery-bookings-events"
    )

    private val producer: KafkaProducer<String, Event<*>> = KafkaProducer(producerProps)

    override fun publishEvent(event: Event<*>) {
        val record = ProducerRecord(eventToTopic[event.key], event.key, event)
        producer.send(record)
    }
}
