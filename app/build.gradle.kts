plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.shoppingapplicatonecommerce"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.shoppingapplicatonecommerce"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation ("com.google.firebase:firebase-auth:22.1.2")
    implementation ("com.google.firebase:firebase-auth:22.1.2")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("de.hdodenhof:circleimageview:3.1.0")
    implementation ("com.theartofdev.edmodo:android-image-cropper:2.8.0")
    implementation ("com.google.firebase:firebase-core:21.1.1")
    implementation ("com.squareup.picasso:picasso:2.71828")
    implementation ("io.paperdb:paperdb:2.7.1")
    implementation ("com.github.rey5137:material:1.3.1")
    implementation ("com.firebaseui:firebase-ui-database:8.0.2")
    implementation("com.google.firebase:firebase-database:20.2.2")
    implementation("com.google.firebase:firebase-storage:20.2.1")
    implementation("com.android.support:support-annotations:28.0.0")
    implementation("com.google.firebase:firebase-database-ktx:20.2.2")
    testImplementation("junit:junit:4.13.2")

    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation ("com.google.firebase:firebase-analytics")
}