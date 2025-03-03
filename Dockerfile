FROM eclipse-temurin:21-jdk-jammy
WORKDIR /app
# Now the JAR will be named app.jar in target/ directory
COPY target/app-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]

EXPOSE 8080
