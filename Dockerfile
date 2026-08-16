FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY target/*.jar student-demo-service-app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "student-demo-service-app.jar"]