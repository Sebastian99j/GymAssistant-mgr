plugins {
    `android-library`
    `kotlin-android`
}

apply<MainGradlePlugin>()

android {
    namespace = "com.gymassistant.core"
}

dependencies {
    basic()
    hilt()
}