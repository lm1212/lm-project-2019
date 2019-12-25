package com.lm.consumer.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration//相当与xml bean 注入
public class ConfigBean {
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
}
