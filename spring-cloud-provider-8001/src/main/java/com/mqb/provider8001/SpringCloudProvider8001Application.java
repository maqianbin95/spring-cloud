package com.mqb.provider8001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.mqb.provider8001.providerdept.mapper")
public class SpringCloudProvider8001Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudProvider8001Application.class, args);
	}

}
