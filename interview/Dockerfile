FROM openjdk:8
ADD target/docker-fizz-buzz.jar docker-fizz-buzz.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "docker-fizz-buzz.jar"]