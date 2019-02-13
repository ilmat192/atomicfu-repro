buildscript {
    repositories {
        jcenter()
    }

    dependencies {
        classpath("org.jetbrains.kotlinx:atomicfu-gradle-plugin:0.12.0")
    }
}

plugins {
    kotlin("multiplatform") version "1.3.21"
}

apply(plugin = "kotlinx-atomicfu")

repositories {
    jcenter()
}

kotlin {
    macosX64("repro")
}
