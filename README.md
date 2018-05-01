This project is a documentation project only. The full documentation
can be found on GitHub pages: https://mrumpf.github.com/spring-cloud-on-k8s/

The application to verify the migration steps can be found in another repository:
https://github.com/mrumpf/spring-petclinic-microservices


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
