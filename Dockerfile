FROM openjdk:17-jdk-alpine
COPY build/libs/ProductService-0.0.1-SNAPSHOT.jar ProductService.jar

EXPOSE 9393

# Command to run when the container starts
CMD ["java", "-jar", "ProductService.jar"]