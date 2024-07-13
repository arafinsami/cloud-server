package com.dbh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DbhGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(DbhGatewayApplication.class, args);
    }
}
