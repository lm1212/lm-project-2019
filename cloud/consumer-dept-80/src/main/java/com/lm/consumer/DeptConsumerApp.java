package com.lm.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.lm.rule.MyRule;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-DEPT",configuration = MyRule.class)
public class DeptConsumerApp {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumerApp.class, args);
	}
}
