import org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension

fun KotlinProjectExtension.configureJvmToolChain() {
    jvmToolchain(21)
}