# Use Java 17 (recommended for Spring Boot 3.x)
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy JAR file
COPY target/bloghub-0.0.1-SNAPSHOT.jar app.jar

# Expose port (Render injects PORT env variable)
EXPOSE 8082

# Run Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]
