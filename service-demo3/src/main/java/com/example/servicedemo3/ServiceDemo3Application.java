package com.example.servicedemo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceDemo3Application {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDemo3Application.class, args);
	}
}
