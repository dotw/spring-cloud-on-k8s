The purpose of the application is to test the various aspects of a Spring Cloud Kubernetes migration
and to define the steps required to complete the transformation.

See https://mrumpf.github.com/spring-cloud-on-k8s/ for the full documentation.

# Application

The microservices demo application has the following modules:
* bank-client - a client withdraing or depositing money from an account
* bank-server - the front facing facade to the backend microservices
* bank-infrastructure - the infrastructure services like Eureka / Config Server / ...
* ...


# Kotlin
Created the project from Spring Boot Initializr http://start.spring.io with the following technologies:
* Java 10
* Kotlin

# Gradle
Added Gradle Wrapper Version 4.7 like this:
````
gradle wrapper --gradle-version 4.7 --distribution-type all
````


# IntelliJ IDEA
* Plugins
  * AsciiDoc
  * PlantUML Integration
  * PlantUML Syntax Check


# Documentation
Documentation project in a docs sub-module in AsciiDoc using AsciiDoctor and publish to GitHub pages upon commit.

* Asciidoctor
  * http://asciidoctor.github.io/asciidoctor-gradle-examples/
* Publishing
  * https://pages.github.com/
* JBake (later)
  * https://jbake.org/
 