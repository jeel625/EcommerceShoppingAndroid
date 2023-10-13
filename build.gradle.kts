import com.android.build.gradle.internal.dsl.decorator.SupportedPropertyType.Collection.List.type
import com.android.build.gradle.internal.errors.DeprecationReporterImpl.Companion.clean

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.1" apply false
    id("com.google.gms.google-services") version "4.3.10" apply false
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        jcenter()
        mavenCentral()
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:8.1.2")
        classpath ("com.google.gms:google-services:4.4.0")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}






