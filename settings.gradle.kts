pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven("https://dl-maven-android.mintegral.com/repository/mbridge_android_sdk_support/")
        maven("https://maven.aliyun.com/repository/central")
        maven("https://maven.aliyun.com/repository/public")
        maven("https://maven.aliyun.com/repository/google")
        maven("https://maven.aliyun.com/repository/gradle-plugin")
        maven("https://www.jitpack.io")
        maven("https://dl.bintray.com/thelasterstar/maven/")
        maven("https://oss.sonatype.org/content/repositories/snapshots")
        maven("https://repo1.maven.org/maven2/")
    }
}

rootProject.name = "YicJetpackMvvm"
include(":app")
include(":JetpackMvvm")
 