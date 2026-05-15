package com.ibm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringbootMs1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMs1Application.class, args);
		System.out.println("it is running in via jenkins - new dep ");
	}

}
