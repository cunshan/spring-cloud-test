package com.redbean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringCloudProviderDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudProviderDemoApplication.class, args);
	}
}
