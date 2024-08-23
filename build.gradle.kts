// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        // Update to the latest version of Google Services plugin
        classpath("com.google.gms:google-services:4.3.15")
    }
}

plugins {
    // Declare plugin versions and apply them to modules as needed
    alias(libs.plugins.android.application) apply false
    id("com.google.gms.google-services") version "4.3.15" apply false
}
