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
            testTask {
                useKarma {
                    useChromeHeadless()
                }
            }
            binaries.executable()
        }
    }

}

