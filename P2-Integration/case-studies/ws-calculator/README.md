# Case Study: OpenAPI Calculator Web Service

## Disclaimer
This is not (and not meant to be) a RESTful service, as it doesn't abide by all REST constraints / design principles, mainly HATEOAS.

## Technologies
- Service definition language: OAS (OpenAPI Specification) 3.0
- Protocol: Raw HTTP
- Provider programming language: Java. We leverage the power of Spring Boot as an opinionated application framework to easily develop and expose a basic web service
- Consumer programming language: Python (Generated through Swagger tools)

## Development Process (Java-first)

### Develop the Java provider
 You can just clone this repository or initialize your own Spring Boot application.
To initialize a Spring Boot application, you need to create a Gradle project, customized with the necessary Spring Boot dependencies. Spring Boot Initializr provides a user-friendly UI to do so.
- Go to Spring Boot Initializr: https://start.spring.io
- Choose Gradle Project + Java Language + the latest stable version of Spring Boot
- Set project metadata
- Add Spring Web dependency (Just search for *rest*)
- Hit *GENERATE*

You will get your initialized Gradle project as a zip file. Unzip it and this will be your work/project directory.

- Write the calculator service business implementation: ma.aui.sse.paradigms.integration.ws.calculator.provider.Calculator
- Mark it as a web service through the @RestController Spring annotation. *Caution: This is not enough to consider our web service a RESTful service*
- Write Result data transfer object (DTO): ma.aui.sse.paradigms.integration.ws.calculator.provider.Result

### Generate the OpenAPI Service Description
We generate the OpenAPI service description from ma.aui.sse.paradigms.integration.ws.calculator.provider.Calculator. To do so, we use Springdoc-OpenAPI generation tool:
- Add 'org.springdoc:springdoc-openapi-ui:1.5.5' dependency to build.gradle
- Access `http://localhost:8080/v3/`
- Copy the output. This is our Calculator OpenAPI definition

### Develop the Python consumer
- Generate Python client stub from the generated Calculator OpenAPI definition using [SwaggerHub.com](https://www.swaggerhub.com)
- Unzip the generated python code under `src/main/python/consumer`
- Get to the unzipped folder and run: `python setup.py install`
- Write the consumer: `src/main/python/consumer/consumer.py`
- Run it: `python src/main/python/consumer/consumer.py`