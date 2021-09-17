plugins {
    kotlin("jvm") version "1.5.30"
    `maven-publish`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("kotlin") {
                from(components["kotlin"])

                groupId = "org.example.library"
                artifactId = "library"
                version = "1.0"
            }
        }
    }
}
