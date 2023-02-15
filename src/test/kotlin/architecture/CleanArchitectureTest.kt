/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package architecture

import com.tngtech.archunit.core.importer.ClassFileImporter
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition
import com.tngtech.archunit.library.Architectures.layeredArchitecture
import io.kotest.core.spec.style.FunSpec

class CleanArchitectureTest : FunSpec({

    test("Domain logic layer should not depend on any other layers") {
        ArchRuleDefinition
            .noClasses().that().resideInAPackage("..entities..")
            .should().dependOnClassesThat().resideInAPackage("..application..")
            .andShould().dependOnClassesThat().resideInAPackage("..infrastructure..")
            .check(ClassFileImporter().importPackages("..entities.."))
    }

    test("Application layer should not depend on Infrastructure layer") {
        ArchRuleDefinition
            .noClasses().that().resideInAPackage("..application..")
            .should().dependOnClassesThat().resideInAPackage("..infrastructure..")
            .check(ClassFileImporter().importPackages("..application.."))
    }

    test("The layer of architecture should respect clean architecture principles") {
        layeredArchitecture()
            .consideringAllDependencies()
            .layer("Entity").definedBy("..entities..")
            .layer("Application").definedBy("..application..")
            .layer("Infrastructure").definedBy("..infrastructure..")
            .whereLayer("Application").mayOnlyBeAccessedByLayers("Infrastructure")
            .whereLayer("Entity").mayNotAccessAnyLayer()
    }
})
