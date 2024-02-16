FROM openjdk:17-jre-alpine

WORKDIR /app

COPY target/*.jar ./

CMD ["java", "-jar", "calculator-1.0.jar"]