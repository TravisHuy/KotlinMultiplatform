rootProject.name = "Kotlinplatform"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        google ()
        mavenCentral()
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
    plugins {
        id("com.android.application") version "8.0.0"
        id("com.android.library") version "8.0.0"
        id("org.jetbrains.compose") version "1.6.11"
        id("org.jetbrains.kotlin.multiplatform") version "2.0.20"
        id("org.jetbrains.kotlin.plugin.compose") version "2.0.20"
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

include(":composeApp")