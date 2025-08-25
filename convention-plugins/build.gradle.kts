plugins {
    `kotlin-dsl`
}
fun pluginId(pluginName: String, version: String) = "$pluginName:$pluginName.gradle.plugin:$version"

dependencies {
    implementation(libs.nexus.publish)
    implementation(pluginId("org.jetbrains.kotlin.multiplatform", "2.1.0"))
    implementation(pluginId("net.kigawa.renlin-compiler", "1.3.8"))
}