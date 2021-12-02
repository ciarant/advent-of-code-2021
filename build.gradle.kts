import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.0"
    id("io.gitlab.arturbosch.detekt").version("1.19.0")
    application
}

group = "com.sonalake"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "13"
}

detekt {
    config = files("detekt.yml")
}

application {
    mainClass.set("MainKt")
}