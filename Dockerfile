FROM openjdk:8-jdk-alpine
ADD target/Rest-Api-0.0.1-SNAPSHOT.jar rest-api.jar
ENTRYPOINT ["sh","-c","java -jar /rest-api.jar"]