FROM openjdk:22-jdk-buster

WORKDIR /dbh-gateway

COPY target/dbh-gateway-V.1.0.0.jar dbh-gateway.jar

EXPOSE 8761

ENTRYPOINT ["java", "-jar", "dbh-gateway.jar"]