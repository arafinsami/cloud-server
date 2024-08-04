1. docker network create dbh-network
2. docker run --name dbh-mysql-container --network dbh-network -e MYSQL_ROOT_PASSWORD=arafinN@12 -e MYSQL_DATABASE=dbh -p 3307:3306 -d mysql:8.0
3. mvn clean install -Dmaven.test.skip=true

1. docker build -t dbh-discovery-server:V.1.0.0 .
2. docker run --name dbh-discovery-server-container --network dbh-network -p 8761:8761 -d dbh-discovery-server:V.1.0.0


1. docker build -t dbh-gateway:V.1.0.0 .
2. docker run --name dbh-gateway-container --network dbh-network -p 9999:9999 -d dbh-gateway:V.1.0.0


1. docker build -t dbh-app:V.1.0.0 .
2. docker run --name dbh-app-container --network dbh-network -p 8001:8001 -d dbh-app:V.1.0.0


1. docker build -t dbh-query-service-app:V.1.0.0 .
2. docker run --name dbh-query-service-app-container --network dbh-network -p 8002:8002 -d dbh-query-service-app:V.1.0.0


1. docker build -t dbh-command-service-app:V.1.0.0 .
2. docker run --name dbh-command-service-app-container --network dbh-network -p 8003:8003 -d dbh-command-service-app:V.1.0.0

4. spring.datasource.url=jdbc:mysql://dbh-mysql-container:3306/dbh


docker stop $(docker ps -q)

docker rm $(docker ps -a -q)

docker rmi -f $(docker images -q)

docker system prune -af