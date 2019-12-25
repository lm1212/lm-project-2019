package com.lm.provide.service;

import java.util.List;

import com.lm.entity.Dept;

public interface DeptService {
	
	public boolean add(Dept dept);
	
	public Dept get(Long id);
	
	public List<Dept> list();
	
}
