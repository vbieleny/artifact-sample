plugins {
    kotlin("jvm") version "1.5.30"
    application
}

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.example.library:library:1.0")
}

application {
    mainClass.set("org.example.app.AppKt")
}
