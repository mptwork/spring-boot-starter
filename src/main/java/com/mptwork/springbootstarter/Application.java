package com.mptwork.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.media.Schema;


/**
 * Application is the entry point of the Spring Boot application.
 *
 * @author Issac Lee
 * @version 1.0
 * @since 1.0
 */

@OpenAPIDefinition(
  info = @Info(
    title = "Spring Boot Starter",
    description = "This is a sample Spring Boot web application that demonstrates the basic structure and features of a web application built with Spring Boot",
    version = "1.0",
    contact = @Contact(
        name = "Issac Lee",
        email = "www.example.com"

    ),
    license = @License(
        name = "Creative Commons Licenses",
        url = ""
    )
  ),
  servers = {
    @Server(
        url = "http://localhost:8080"
    )
  }
)
@SecurityScheme(
    type = SecuritySchemeType.HTTP,
    name = "bearerAuth",
    scheme = "bearer",
    bearerFormat = "JWT"
)
@SpringBootApplication
public class Application {

    /**
     * Main method as the entry point of the application when it is launched from the command line.
     * 
     * @param args command line arguments to be passed to the application
     */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
