import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi

plugins {
    alias(libs.plugins.kotlinMultiplatform)
}


repositories {
    mavenCentral()
}

dependencies {
}

kotlin {
    jvm {
        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        compilerOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
        }
    }
    js {
        browser {
            binaries.executable()
        }
    }

}

tasks.register<JavaExec>("runGenerator") {
    group = "application"
    description = "Run the code generator"
    dependsOn("jvmMainClasses")
    classpath = kotlin.targets["jvm"].compilations["main"].output.allOutputs + kotlin.targets["jvm"].compilations["main"].runtimeDependencyFiles
    mainClass.set("_Tag_generateKt")
}
