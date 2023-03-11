import com.github.davidmc24.gradle.plugin.avro.GenerateAvroJavaTask

plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
    java
    id ("com.github.davidmc24.gradle.plugin.avro").version("1.6.0")
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

    // Use JUnit Jupiter for testing.
    testImplementation("org.junit.jupiter:junit-jupiter:$junitJupiterVersion")

    // This dependency is used by the application.
    implementation("com.google.guava:guava:31.1-jre")
}

application {
    // Define the main class for the application.
    mainClass.set("my.example.App")
}

sourceSets {
    main {
        java {
            setSrcDirs(listOf("src/main/java"))
        }
    }

    test {
        java {
            setSrcDirs(listOf("src/test/java"))
        }
    }
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}

avro {
    isCreateSetters.set(true)
    isCreateOptionalGetters.set(false)
    isGettersReturnOptional.set(false)
    fieldVisibility.set("PUBLIC")
    outputCharacterEncoding.set("UTF-8")
    stringType.set("String")
    templateDirectory.set(null as String?)
    isEnableDecimalLogicalType.set(true)
}


tasks.withType<com.github.davidmc24.gradle.plugin.avro.GenerateAvroJavaTask> {
    setOutputDir(file("src/main/java/"))
}
