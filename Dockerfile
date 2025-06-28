# Use the official OpenJDK 17 image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy everything to the container
COPY . .

# Give permission to run mvnw
RUN chmod +x mvnw

# Build the application, skipping tests
RUN ./mvnw clean package -DskipTests

# Expose the port your Spring Boot app runs on
EXPOSE 8080

# Run the generated JAR file
CMD ["java", "-jar", "target/demo-0.0.1-SNAPSHOT.jar"]
