# Use a base image with Gradle and Java installed
FROM gradle:7.3.3-jdk11 AS build

# Set the working directory
WORKDIR /app

# Copy the build.gradle and settings.gradle files
COPY build.gradle .
COPY settings.gradle .

# Copy the source code
COPY src ./src

# Build the application
RUN gradle build -x test

# Create a new Docker image with a smaller base image
FROM openjdk:11-jre-slim
ARG version="0.0.1-SNAPSHOT"
ARG jar_file=spring-boot-starter-${version}.jar


# Set the working directory
WORKDIR /app
EXPOSE 8080

# Copy the built JAR file from the build stage
COPY --from=build /app/build/libs/${jar_file} ./mainapp.jar

# Set the command to run the application
CMD ["java", "-jar", "mainapp.jar"]
