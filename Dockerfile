FROM openjdk:8
ADD target/munyi-api-0.0.1-SNAPSHOT.jar munyi-api-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "munyi-api-0.0.1-SNAPSHOT.jar"]