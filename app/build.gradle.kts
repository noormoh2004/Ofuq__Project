plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.ofuqproject"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.ofuqproject"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

// أضيفي هذا الجزء هنا لفرض النسخ المتوافقة مع SDK 34
configurations.all {
    resolutionStrategy {
        force("androidx.core:core:1.12.0")
        force("androidx.core:core-ktx:1.12.0")
        force("androidx.activity:activity:1.8.0")
        force("androidx.activity:activity-ktx:1.8.0")
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.activity:activity-ktx:1.8.0")
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("com.airbnb.android:lottie:6.0.0")
    implementation(libs.activity)
    // أزيلي السطر الخاص بـ libs.activity لأنه غير معرف عندك بالـ toml وسبب لك مشاكل سابقة
    // implementation(libs.activity)

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}