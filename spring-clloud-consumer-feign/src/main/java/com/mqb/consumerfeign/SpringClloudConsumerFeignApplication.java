package com.mqb.consumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.mqb.consumerfeign.providerdept")
@EnableEurekaClient
public class SpringClloudConsumerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringClloudConsumerFeignApplication.class, args);
	}

}
