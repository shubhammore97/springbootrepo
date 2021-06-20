FROM openjdk:8
VOLUME /tmp
EXPOSE 8080
ADD target/springDockerTest-0.0.1-SNAPSHOT.jar springDockerTest-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","springDockerTest-0.0.1-SNAPSHOT.jar"]
