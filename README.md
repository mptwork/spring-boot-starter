# Spring Boot Web Application

This is a sample Spring Boot web application that demonstrates the basic structure and features of a web application built with Spring Boot.

## Description

The Spring Boot Web Application showcases how to create a simple web application using Spring Boot framework. It includes the following features:

- RESTful API endpoints for various operations
- Basic HTML views using Thymeleaf templating engine
- Static resource serving (CSS, JavaScript, images)
- Configuration using application.properties or application.yml
- Observability with Actuator and Prometheus
- SpringDoc OpenAPI documentation
- Maven or Gradle build configuration

## Prerequisites

Before running the application, ensure you have the following installed:

- Java Development Kit (JDK) 11 or higher
- Apache Maven or Gradle

## Getting Started

1. Clone this repository to your local machine.

2. Open the project in your preferred IDE or navigate to the project root directory in a terminal.

3. Build the project using Maven or Gradle:
   - For Maven: `mvn clean install`
   - For Gradle: `gradle build`

4. Run the application:
   - For Maven: `mvn spring-boot:run`
   - For Gradle: `gradle bootRun`
   - Using JAR file: `java -jar builds/libs/spring-boot-starter-0.0.1-SNAPSHOT.jar`

5. Once the application is running, open a web browser and navigate to `http://localhost:8080` to access the application.


Note, the Spring Boot application as an executable JAR file includes an embedded web server. The JAR file contains all the necessary dependencies and configurations, making it self-contained and easy to distribute.


## OpenAPI Documentation
The springdoc-openapi Java library simplifies the process of generating API documentation for Spring Boot projects. It achieves this by analyzing the application at runtime and deriving API semantics from Spring configurations, class structures, and annotations. Documentation will be available in HTML format. The path can be customize in the appliation.properties file.

> http://localhost:8080/docs


## Additional Information

- The main application class is located at `src/main/java/com/mptwork/springbootstarter/Application.java`.
- Controller classes are located in the `src/main/java/com/mptwork/springbootstarter/controllers` directory.
- HTML templates can be found in the `src/main/resources/templates` directory.
- Static resources (CSS, JavaScript, images) are stored in the `src/main/resources/static` directory.


## License

This project is licensed under the [MIT License](LICENSE).

## Contact

For any questions or inquiries, please contact Issac Lee (mailto:issacl@mptwork.com).


## Reference

- [Maven Repository](https://mvnrepository.com/artifact/org.springdoc)
- [Spring REST Docs and OpenAPI](https://www.baeldung.com/spring-rest-docs-vs-openapi)
- [Spring Docs](https://springdoc.org/#Introduction)
- [OpenAPI Specification](https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#oasObject)
- [OpenAPI Documentation](https://howtodoinjava.com/spring-boot springdoc-openapi-rest-documentation/)