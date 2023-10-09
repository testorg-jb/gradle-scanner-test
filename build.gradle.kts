plugins {
    id("java")
    id("org.sonarqube") version "4.3.1.3277"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

sonar {
    properties {
        property("sonar.projectKey", "testorg-jb_jackrabbit")
        property("sonar.organization", "testorg-jb")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.google.api-ads:adwords-axis:4.20.0")
}

tasks.test {
    useJUnitPlatform()
}