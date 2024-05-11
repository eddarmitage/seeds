plugins {
	java
	id("org.springframework.boot") version "3.2.5"
	id("io.spring.dependency-management") version "1.1.4"
	id("org.graalvm.buildtools.native") version "0.9.28"
}

group = "com.eddarmitage"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_21
	toolchain {
		languageVersion.set(JavaLanguageVersion.of(21))
		vendor.set(JvmVendorSpec.GRAAL_VM)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-data-mongodb")
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework.boot:spring-boot-testcontainers")
	testImplementation("org.testcontainers:junit-jupiter")
	testImplementation("org.testcontainers:mongodb")
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.wrapper {
	gradleVersion = "8.8-rc-1"
}
