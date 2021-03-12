# Steps
## The Service Provider as a Spring Boot Application
We leverage the power of Spring Boot as an opinionated application framework to easily develop and expose a Restful web service. You can just clone this repository or initialize your own Spring Boot application.

To initialize a Spring Boot application, you need to create a Gradle project, customized with the necessary Spring Boot dependencies. Spring Boot Initializr provides a user-friendly UI to do so.
- Go to Spring Boot Initializr: https://start.spring.io
- Choose Gradle Project + Java Language + the latest stable version of Spring Boot
- Set project metadata
- Add Spring Web dependency (Just search for *rest*)
- Hit *GENERATE*

You will get your initialized Gradle project as a zip file. Unzip it and this will be your work/project directory.

## Generate the OpenAPI Service Description
Here, we adopt a Java-first approach. So, we generate the OpenAPI service description from ma.aui.sse.paradigms.integration.rs.provider.Calculator. To do so, we use Springdoc-OpenAPI library:
- Add 'org.springdoc:springdoc-openapi-ui:1.5.5' dependency to build.gradle