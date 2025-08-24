import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi

plugins {
    kotlin("multiplatform")
    id("net.kigawa.renlin-compiler")
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
        }
    }
    sourceSets["commonMain"].dependencies {
        implementation("net.kigawa:hakate:3.3.2")
        implementation("net.kigawa.renlin-compiler:renlin-kotlin-plugin:1.3.8")
    }
    sourceSets["commonTest"].dependencies {


    }
    sourceSets["jvmMain"].dependencies {

    }
    sourceSets["jvmTest"].dependencies {

    }

    sourceSets["jsMain"].dependencies {

    }
    sourceSets["jsTest"].dependencies {
    }
}

