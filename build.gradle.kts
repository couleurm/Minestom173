plugins {
    id("java")
}

group = "ca.spottedleaf"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("net.minestom:minestom:2026.03.03-1.21.11")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(25)) // Minestom has a minimum Java version of 25
    }
}
