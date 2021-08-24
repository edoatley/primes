import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    jacoco
    java
    id ("org.springframework.boot") version "2.5.4"
    id ("io.spring.dependency-management") version "1.0.11.RELEASE"
    id ("io.freefair.lombok") version "6.1.0-m3"
    kotlin("jvm") version "1.4.21"
    kotlin("plugin.spring") version "1.4.21"
}

group = "com.edoatley"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("io.projectreactor:reactor-test:3.4.8")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "1.8"
    }
}


tasks.withType<Test> {
    useJUnitPlatform()
}


