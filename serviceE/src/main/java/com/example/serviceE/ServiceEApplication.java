package com.example.serviceE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceEApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceEApplication.class, args);
	}

}
