package com.lm.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.lm.entity.Dept;

@RestController
public class DeptConsumerController {
	
	private static final String url = "http://cloud-dept/";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value = "/get/{id}",method =RequestMethod.GET)
	public Dept getDept(@PathVariable("id")Long id) {
		return restTemplate.getForObject(url+"/dept/get/"+id,Dept.class);
	}
}
