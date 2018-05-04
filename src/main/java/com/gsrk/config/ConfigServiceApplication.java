package com.gsrk.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication(scanBasePackages="com.gsrk")
public class ConfigServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConfigServiceApplication.class, args);
	}
}
