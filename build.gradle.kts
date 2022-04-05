
buildscript {
    repositories {
        maven { url = uri(System.getenv("MVN_RELEASE_REPO")) }
        maven { url = uri(System.getenv("MVN_SNAPSHOT_REPO")) }
    }
}
plugins {
    id("java")
}
group = "com.dvimer"
version = "0.0.1-SNAPSHOT"

repositories {
    maven { url = uri(System.getenv("MVN_RELEASE_REPO")) }
    maven { url = uri(System.getenv("MVN_SNAPSHOT_REPO")) }
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

dependencies {
    //====Lombook============================================================
    compileOnly("org.projectlombok:lombok:1.18.10")
    testCompileOnly("org.projectlombok:lombok:1.18.10")
    annotationProcessor("org.projectlombok:lombok:1.18.10")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.10")

    //====Tuples============================================================
    implementation("org.javatuples:javatuples:1.2")

    //====SerializableUtils============================================================
    implementation("org.apache.commons:commons-lang3:3.0")

    //====Reflections============================================================
    implementation ("org.reflections:reflections:0.9.11")


}
