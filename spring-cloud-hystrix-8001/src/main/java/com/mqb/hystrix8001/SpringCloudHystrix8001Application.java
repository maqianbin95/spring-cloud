package com.mqb.hystrix8001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication   //主类
@EnableEurekaClient      //服务注册
@EnableCircuitBreaker    //开启熔断器
@MapperScan("com.mqb.hystrix8001.providerdept.mapper")
public class SpringCloudHystrix8001Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudHystrix8001Application.class, args);
	}

}
