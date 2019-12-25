package com.lm.provide.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lm.entity.Dept;
import com.lm.provide.service.DeptService;

@RestController
public class DeptController {

	@Autowired
	private DeptService deptService;

	@RequestMapping("/test")
	public String test() {
		return "hello";
	}

	@RequestMapping(value = "/dept/add",method = RequestMethod.POST)
	public boolean addDept(@RequestBody Dept dept) {
		return deptService.add(dept);
	}
	
	@RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
	public Dept getDeptById(@PathVariable("id") Long id) {
		return deptService.get(id);
	}

}