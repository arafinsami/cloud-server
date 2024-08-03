FROM openjdk:22-jdk-buster

WORKDIR /dbh-discovery-server

COPY target/dbh-discovery-server-V.1.0.0.jar dbh-discovery-server.jar

EXPOSE 8761

ENTRYPOINT ["java", "-jar", "dbh-discovery-server.jar"]