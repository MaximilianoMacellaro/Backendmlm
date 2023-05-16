FROM amazoncorretto:11-jdk
MAINTAINER MLM
COPY target/mlm-0.0.1-SNAPSHOT.jar  app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080