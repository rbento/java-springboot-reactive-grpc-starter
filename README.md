# java-springboot-reactive-grpc-starter
![Build](https://github.com/rbento/java-springboot-reactive-grpc-starter/actions/workflows/gradle.yml/badge.svg)

A starter project for practicing the development of Reactive gRPC APIs backed by Spring Boot.

**Features**

- A simple notepad data model.
- Integration Tests for reactive endpoints:
    - InProcess Server and Channel to test endpoints in isolation.
	- [TestContainers](https://java.testcontainers.org) for integration testing with data storage.
	- StepVerifier for testing Reactive code.

### Requirements

- [Gradle](https://gradle.org/releases/) 8.4
- [JDK 21](https://www.azul.com/downloads/?package=jdk#zulu) from Azul

### Build

```bash
./gradlew clean build
```

### Run

```bash
./gradlew bootRun
```

