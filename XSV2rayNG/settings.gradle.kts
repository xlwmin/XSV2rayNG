pluginManagement {
    repositories {
        maven {setUrl("https://maven.aliyun.com/repository/central")}

        gradlePluginPortal()
        google()
        mavenCentral()
        maven {setUrl("https://jitpack.io")}
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven {setUrl("https://maven.aliyun.com/repository/central")}

        google()
        mavenCentral()
        maven {setUrl("https://jitpack.io")}
    }
}
rootProject.name = "XSV2rayNG"
include(":app")
