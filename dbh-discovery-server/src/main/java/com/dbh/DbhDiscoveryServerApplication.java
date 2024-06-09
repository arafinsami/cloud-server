package com.dbh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DbhDiscoveryServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(DbhDiscoveryServerApplication.class, args);
	}
}
