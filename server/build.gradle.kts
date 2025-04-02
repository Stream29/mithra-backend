plugins {
    id("kotlin-jvm-base")
    alias(libs.plugins.ktor)
    application
}

dependencies {
    implementation(project(":shared"))
    implementation(libs.bundles.ktor)
    implementation(libs.bundles.koin)
    testImplementation(libs.bundles.testing)
}

application {
    mainClass = "com.iskportal.mithra.server.AppKt"
}
