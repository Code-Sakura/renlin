plugins {
    alias(libs.plugins.kotlinMultiplatform)
}


repositories {
    mavenCentral()
}

dependencies {
}

kotlin {
    js {
        browser {
            binaries.executable()
        }
    }
    sourceSets["commonMain"].dependencies {
        implementation(project(":renlin"))
        implementation(libs.kotlinx.coroutines.core)
    }
    sourceSets["commonTest"].dependencies {
        implementation(kotlin("test-common"))
        implementation(kotlin("test-annotations-common"))
        implementation(libs.kotlinx.coroutines.test)
        implementation(libs.kotlinx.datetime)

    }
    sourceSets["jvmMain"].dependencies {
    }
    sourceSets["jvmTest"].dependencies {
        implementation(libs.kotlin.test.junit)
    }

    sourceSets["jsMain"].dependencies {
        implementation(libs.kotlin.stdlib.js)
    }
    sourceSets["jsTest"].dependencies {
        implementation(kotlin("test-js"))
    }
}

