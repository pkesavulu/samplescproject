FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/scb-0.0.1-SNAPSHOT.jar scb.jar
ENTRYPOINT ["java","-jar","/scb.jar"]