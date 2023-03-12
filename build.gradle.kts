plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
    java
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
        vendor.set(JvmVendorSpec.AMAZON)
    }
}

version = "0.0.1"
var avroVersion = "1.11.1"
var junitJupiterVersion = "5.9.1"

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {

    implementation("org.apache.avro:avro:$avroVersion")
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("hue-avro-lib-0.0.1.jar"))))
    implementation("org.xerial.snappy:snappy-java:1.1.9.1")

    implementation("ch.qos.logback:logback-classic:1.4.5")
    implementation("org.slf4j:slf4j-api:2.0.6")

    // Use JUnit Jupiter for testing.
    testImplementation("org.junit.jupiter:junit-jupiter:$junitJupiterVersion")

    // This dependency is used by the application.
    implementation("com.google.guava:guava:31.1-jre")
}

application {
    // Define the main class for the application.
    mainClass.set("my.example.App")
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}

