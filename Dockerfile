FROM openjdk:11
EXPOSE 8080
ADD target/sample-web-app-cars.jar sample-web-app-cars.jar
ENTRYPOINT ["java", "-jar", "/sample-web-app-cars.jar"]