plugins {
    id("kotlin-multiplatform-base")
}

kotlin {
    jvm()
    js(IR) {
        generateTypeScriptDefinitions()
        browser()
    }

    sourceSets {
        commonMain {
            dependencies {

            }
        }
    }
}