package com.mqb.consumer8088;

import com.mqb.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="PROVIDER",configuration = MySelfRule.class) //自定义
@EnableFeignClients
public class SpringCloudConsumer8088Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsumer8088Application.class, args);
	}

}
