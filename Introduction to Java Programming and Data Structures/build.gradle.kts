plugins {
    idea
    groovy
    kotlin("jvm") version "1.9.0"
    application
    id("org.openjfx.javafxplugin") version "0.0.14"
}

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

val lombokVersion by extra("1.18.28")
val commonsLang3Version by extra("3.12.0")
val commonsCollectionsVersion by extra("4.4")
val commonsIoVersion by extra("2.13.0")
val groovyVersion by extra("4.0.12")

dependencies {
    compileOnly("org.projectlombok:lombok:$lombokVersion")
    annotationProcessor("org.projectlombok:lombok:$lombokVersion")
    implementation("org.apache.commons:commons-lang3:$commonsLang3Version")
    implementation("org.apache.commons:commons-collections4:$commonsCollectionsVersion")
    implementation("commons-io:commons-io:$commonsIoVersion")
    implementation("org.apache.groovy:groovy:$groovyVersion")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.isFork = true
}

tasks.withType<JavaExec> {
    standardInput = System.`in`
}

javafx {
    version = "17"
    modules("javafx.controls", "javafx.fxml")
}

application {
//    mainClass.set("org.mrdrprof.solutions.chapter_14_javafx_basics.practice.Ex1410")
    mainClass.set("org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.practice.Ex1528")
}

idea {
    module {
        isDownloadJavadoc = true
        isDownloadSources = true
    }
}
