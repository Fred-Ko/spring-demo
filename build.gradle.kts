plugins {
    id("org.springframework.boot") version "3.1.5" // Updated from 3.0.5
    id("io.spring.dependency-management") version "1.1.3" // Updated from 1.1.0
    kotlin("jvm") version "1.9.20" // Updated from 1.7.22
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
//    implementation("org.springframework.boot:spring-boot-starter-security")
//    implementation("org.springframework.boot:spring-boot-starter-oauth2-client")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.flywaydb:flyway-core")
    implementation("org.springframework.kafka:spring-kafka")
    implementation("org.springframework.boot:spring-boot-starter-batch")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.springframework.boot:spring-boot-starter-cache")
    implementation("com.netflix.graphql.dgs:graphql-dgs-spring-boot-starter:8.0.3")
    implementation("org.postgresql:postgresql")
    implementation("org.projectlombok:lombok:1.18.22")
    implementation("com.github.javafaker:javafaker:1.0.2")
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
//    implementation("org.springframework.kafka:spring-kafka-streams")
//    implementation("org.springframework.session:spring-session")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
