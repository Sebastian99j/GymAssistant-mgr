import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.project

object Dependencies {
    const val composeMaterial = "androidx.compose.material3:material3"
    const val composeUi = "androidx.compose.ui:ui"
    const val composeUiGraphics = "androidx.compose.ui:ui-graphics"
    const val composeUiTooling = "androidx.compose.ui:ui-tooling"
    const val composeUiToolingPreview = "androidx.compose.ui:ui-tooling-preview"
    const val composeRuntime = "androidx.compose.runtime:runtime"

    const val material = "com.google.android.material:material:${Versions.material}"

    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntime}"
    const val activityCompose = "androidx.activity:activity-compose:${Versions.activityCompose}"
    const val junit = "junit:junit:${Versions.junit}"
    const val testExtJunit = "androidx.test.ext:junit:${Versions.testExtJunit}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
    const val composeBom = "androidx.compose:compose-bom:${Versions.composeBom}"
    const val jUnit4 = "androidx.compose.ui:ui-test-junit4"
    const val uiTooling = "androidx.compose.ui:ui-tooling"
    const val uiTestManifest = "androidx.compose.ui:ui-test-manifest"

    const val firebaseBom = "com.google.firebase:firebase-bom:${Versions.firebaseBom}"
    const val firebaseAnalytics = "com.google.firebase:firebase-analytics-ktx"
    const val firebaseCrashlytics = "com.google.firebase:firebase-crashlytics-ktx"

    const val hiltAndroid = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    const val hiltAgp = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"

    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
    const val okHttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"

    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val moshiConverter = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"

    const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.room}"
}

fun DependencyHandler.uiTooling() {
    debugImplementation(Dependencies.uiTooling)
    debugImplementation(Dependencies.uiTestManifest)
}

fun DependencyHandler.material() {
    implementation(Dependencies.material)
}

fun DependencyHandler.firebase() {
    implementation(Dependencies.firebaseAnalytics)
    implementation(Dependencies.firebaseCrashlytics)
}

fun DependencyHandler.basic() {
    implementation(Dependencies.coreKtx)
    implementation(Dependencies.lifecycleRuntime)
    implementation(Dependencies.activityCompose)
    implementation(Dependencies.junit)
    androidTestImplementation(Dependencies.testExtJunit)
    androidTestImplementation(Dependencies.espressoCore)
    androidTestImplementation(Dependencies.jUnit4)
}

fun DependencyHandler.room() {
    implementation(Dependencies.roomRuntime)
    implementation(Dependencies.roomKtx)
    kapt(Dependencies.roomCompiler)
}

fun DependencyHandler.retrofit() {
    implementation(Dependencies.retrofit)
    implementation(Dependencies.moshiConverter)
    implementation(Dependencies.okHttp)
    implementation(Dependencies.okHttpLoggingInterceptor)
}

fun DependencyHandler.compose() {
    implementation(Dependencies.composeUi)
    implementation(Dependencies.composeRuntime)
    implementation(Dependencies.composeUiGraphics)
    implementation(Dependencies.composeUiTooling)
    implementation(Dependencies.composeMaterial)
    debugImplementation(Dependencies.composeUiToolingPreview)
}

fun DependencyHandler.hilt() {
    implementation(Dependencies.hiltAndroid)
    kapt(Dependencies.hiltCompiler)
}

fun DependencyHandler.core() {
    implementation(project(":core"))
}