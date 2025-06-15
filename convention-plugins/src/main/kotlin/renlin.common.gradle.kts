plugins {
    kotlin("multiplatform")

}


kotlin {
    jvm {
//        @OptIn(ExperimentalKotlinGradlePluginApi::class)
//        compilerOptions {
//            freeCompilerArgs = listOf("-Xjsr305=strict")
//        }
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
    sourceSets["commonMain"].dependencies {
        implementation("net.kigawa:hakate:3.3.2")
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

