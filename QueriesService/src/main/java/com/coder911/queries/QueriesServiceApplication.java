package com.coder911.queries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class QueriesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(QueriesServiceApplication.class, args);
	}

}
