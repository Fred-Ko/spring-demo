plugins {
    // 스프링 부트 플러그인
    id("org.springframework.boot") version "3.1.5"
    // 스프링 의존성 관리 플러그인
    id("io.spring.dependency-management") version "1.1.3"
    // 코틀린 JVM 플러그인
    kotlin("jvm") version "1.9.20"
    // Netflix DGS CodeGen 플러그인
    id("com.netflix.dgs.codegen") version "6.1.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    // 메이븐 중앙 저장소 사용
    mavenCentral()
}

dependencies {
    // 웹 애플리케이션 개발을 위한 스프링 부트 스타터
    implementation("org.springframework.boot:spring-boot-starter-web")
    // JPA 사용을 위한 스프링 부트 스타터
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    // 데이터베이스 마이그레이션을 위한 Flyway
    implementation("org.flywaydb:flyway-core")
    // 카프카 메시징을 위한 스프링 카프카
    implementation("org.springframework.kafka:spring-kafka")
    // 배치 처리를 위한 스프링 부트 스타터 배치
    implementation("org.springframework.boot:spring-boot-starter-batch")
    // 입력 값 검증을 위한 스프링 부트 스타터 Validation
    implementation("org.springframework.boot:spring-boot-starter-validation")
    // 캐싱을 위한 스프링 부트 스타터 Cache
    implementation("org.springframework.boot:spring-boot-starter-cache")
    // GraphQL 서비스 개발을 위한 Netflix DGS
    implementation("com.netflix.graphql.dgs:graphql-dgs-spring-boot-starter:8.0.3")
    // PostgreSQL 데이터베이스 드라이버
    implementation("org.postgresql:postgresql")
    // Lombok 라이브러리
    implementation("org.projectlombok:lombok")
    // 가짜 데이터 생성을 위한 JavaFaker
    implementation("com.github.javafaker:javafaker:1.0.2")
    // 테스트를 위한 JUnit Jupiter
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")

    // 추후 사용할 의존성들
    // implementation("org.springframework.kafka:spring-kafka-streams")
    // implementation("org.springframework.session:spring-session")
    // implementation("org.springframework.boot:spring-boot-starter-security")
    // implementation("org.springframework.boot:spring-boot-starter-oauth2-client")
}

java {
    // 자바 버전 설정
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
