package co.touchlab.skie.buildsetup.util

import org.gradle.api.Project

val Project.mavenArtifactId: String
    get() = "skie" + this.path.replace(":", "-")

val Project.dependencyModule: String
    get() = "com.splendo.skie:$name"

val Project.dependencyCoordinate: String
    get() = "$dependencyModule:$version"
