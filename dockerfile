FROM openjdk:17
ADD target/sprmvn.jar sprmvn.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "sprmvn.jar" ]