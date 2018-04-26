# Application

The microservices application looks like this:
* bank-client - a client withdraing or depositing money from an account
* bank-server - the front facing facade to the backend microservices
* bank-infrastrcuture - the infrastructure services like Eureka / Config Server / ...
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
Idea: Document project in a docs sub-module in AsciiDoc using AsciiDoctor and publish to GitHub pages via JBake.

* Asciidoctor
  * http://asciidoctor.github.io/asciidoctor-gradle-examples/
* Publishing
  * https://pages.github.com/
* JBake
  * https://jbake.org/
 