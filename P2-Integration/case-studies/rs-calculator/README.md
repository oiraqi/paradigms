# Case Study: OpenAPI Calculator Web Service

## Disclaimer
This is not (and not meant to be) a REST service, as it doesn't abide by all REST constraints / design principles, mainly HATEOAS.

## Technologies
- Service definition language: OAS (OpenAPI Specification) 3.0
- Protocol: Raw HTTP
- Provider programming language: Java (Spring Boot RestController). We leverage the power of Spring Boot as an opinionated application framework to easily develop and expose a Restful web service.
- Consumer programming language: Python (Generated through Swagger tools)

## The Service Provider as a Spring Boot Application
 You can just clone this repository or initialize your own Spring Boot application.

To initialize a Spring Boot application, you need to create a Gradle project, customized with the necessary Spring Boot dependencies. Spring Boot Initializr provides a user-friendly UI to do so.
- Go to Spring Boot Initializr: https://start.spring.io
- Choose Gradle Project + Java Language + the latest stable version of Spring Boot
- Set project metadata
- Add Spring Web dependency (Just search for *rest*)
- Hit *GENERATE*

You will get your initialized Gradle project as a zip file. Unzip it and this will be your work/project directory.

## Generate the OpenAPI Service Description
Here, we adopt a Java-first approach. So, we generate the OpenAPI service description from ma.aui.sse.paradigms.integration.rs.calculator.provider.Calculator. To do so, we use Springdoc-OpenAPI generation tool:
- Add 'org.springdoc:springdoc-openapi-ui:1.5.5' dependency to build.gradle
- Access `http://localhost:8080/v3/`