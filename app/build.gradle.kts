@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.android)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.realm)
}

android {
    namespace = "com.akkobana.habittracker"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.akkobana.habittracker"
        minSdk = 27
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            buildConfigField ("String", "BASE_URL", "\"https://jsonplaceholder.typicode.com\"")
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        debug {
            buildConfigField("String", "BASE_URL", "\"https://jsonplaceholder.typicode.com\"")
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(libs.bundles.android.deps)
    implementation(libs.bundles.ktor.deps)
    implementation(libs.bundles.koin.deps)
    implementation(libs.bundles.coroutines.deps)
    implementation(libs.realm.base)
    implementation(libs.kotlin.serialization)
    debugImplementation(libs.chucker.debug)
    releaseImplementation(libs.chucker.release)
}