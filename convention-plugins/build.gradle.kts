plugins {
    `kotlin-dsl`
    kotlin("jvm") version "2.1.0"
}
fun pluginId(pluginName: String, version: String) = "$pluginName:$pluginName.gradle.plugin:$version"

dependencies {
    implementation(libs.nexus.publish)
    implementation(pluginId("org.jetbrains.kotlin.multiplatform", "2.1.0"))
    // Temporarily disabled due to Kotlin version compatibility with kotlin-dsl plugin
     implementation(pluginId("net.kigawa.renlin-compiler", "1.3.11"))
    // https://mvnrepository.com/artifact/org.jetbrains.kotlin/kotlin-gradle-plugin
}