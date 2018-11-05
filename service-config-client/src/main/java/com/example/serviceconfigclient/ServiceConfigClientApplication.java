package com.example.serviceconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 此项目作为微服务配置中心client,用于从config-service中读取配置
 */
@SpringBootApplication
public class ServiceConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceConfigClientApplication.class, args);
	}
}
