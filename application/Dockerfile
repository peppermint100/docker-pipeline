FROM amazoncorretto:11-alpine3.14

ARG JAR_FILE=build/libs/application-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

EXPOSE 8080 8081

ENTRYPOINT ["java", "-jar", "-Xdebug", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:8081", "app.jar"]