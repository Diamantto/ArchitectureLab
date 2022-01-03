import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.0"
    application
    kotlin("kapt") version "1.6.0"
}

group = "me.diamantto"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kapt {
    generateStubs = true
}

dependencies {
    testImplementation(kotlin("test"))
    //Dagger
    implementation("com.google.dagger:dagger:2.40.5")
    kapt("com.google.dagger:dagger-compiler:2.40.5")
    implementation("com.thedeanda:lorem:2.1")
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}