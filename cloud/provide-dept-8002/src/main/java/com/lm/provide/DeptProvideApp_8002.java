package com.lm.provide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient
public class DeptProvideApp_8002 {
	public static void main(String[] args) {
		SpringApplication.run(DeptProvideApp_8002.class, args);
	}
}