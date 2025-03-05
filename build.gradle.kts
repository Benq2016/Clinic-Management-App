plugins {
    id("org.springframework.boot") version "3.4.3"
    id("java")
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation ("org.springframework.boot:spring-boot-starter:3.4.3")
    testImplementation ("org.springframework.boot:spring-boot-starter-test:3.4.3")
}

tasks.test {
    useJUnitPlatform()
}