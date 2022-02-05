FROM openjdk:11
ADD target/formify-0.0.1-SNAPSHOT.jar formify-0.0.1-SNAPSHOT.jar
EXPOSE 8888
ENTRYPOINT ["java", "-jar", "/formify-0.0.1-SNAPSHOT.jar"]