/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package infrastructure.digitaltwins.events

/**
 * Object with all the properties path of Digital Twins.
 */
object TwinProperties {

    /**
     * The properties path of Room Model.
     * @param path the property path.
     */
    enum class RoomProperties(val path: String) {
        TEMPERATURE("/temperature"),
        HUMIDITY("/humidity"),
        LUMINOSITY("/luminosity"),
        PRESENCE("/presence_inside")
    }

    /**
     * The properties path of Process events.
     * @param path the property path.
     */
    enum class ProcessProperties(val path: String) {
        MEDICAL_TECHNOLOGY("/is_in_use")
    }

    /**
     * The properties path of Patient Model.
     * @param path the property path.
     */
    enum class PatientProperties(val path: String) {
        BODY_TEMPERATURE("/body_temperature"),
        DIASTOLIC_PRESSURE("/diastolic_blood_pressure"),
        SYSTOLIC_PRESSURE("/systolic_blood_pressure"),
        IS_ON_OPERATING_TABLE("/is_on_operating_table"),
        RESPIRATORY_RATE("/respiratory_rate"),
        SATURATION_PERCENTAGE("/saturation_percentage"),
        HEARTBEAT("/heart_beat"),
    }

    /**
     * The digital twins model id.
     * @param id the model id.
     */
    enum class DTModelID(val id: String) {
        OPERATING_ROOM_MODEL_ID("dtmi:io:github:smartoperatingblock:OperatingRoom;1"),
        PRE_OPERATING_ROOM_MODEL_ID("dtmi:io:github:smartoperatingblock:PrePostOperatingRoom;1"),
        PROCESS_MODEL_ID("dtmi:io:github:smartoperatingblock:SurgicalProcess;1"),
        PATIENT_MODEL_ID("dtmi:io:github:smartoperatingblock:Patient;1"),
        HEALTH_PROFESSIONAL_MODEL_ID("dtmi:io:github:smartoperatingblock:HealthProfessional;1"),
        SURGERY_BOOKING_MODEL_ID("dtmi:io:github:smartoperatingblock:SurgeryBooking;1"),
        MEDICAL_TECHNOLOGY_MODEL_ID("dtmi:io:github:smartoperatingblock:MedicalTechnology;1")
    }

    /**
     * The types of digital twin events.
     * @param type the event type.
     */
    enum class DTEventTypes(val type: String) {
        CREATE("Microsoft.DigitalTwins.Twin.Create"),
        DELETE("Microsoft.DigitalTwins.Twin.Delete"),
        UPDATE("Microsoft.DigitalTwins.Twin.Update"),
        RELATIONSHIP_CREATE("Microsoft.DigitalTwins.Relationship.Create"),
        RELATIONSHIP_DELETE("Microsoft.DigitalTwins.Relationship.Delete"),
    }
}
