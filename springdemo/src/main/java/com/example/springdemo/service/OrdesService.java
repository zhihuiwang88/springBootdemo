package com.example.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdemo.dao.OrdesDao;
import com.example.springdemo.pojo.Ordes;

@Service
public class OrdesService {

	
	@Autowired
	private OrdesDao ordesDao;
	
	
	public List<Ordes> findAll() {
		return  ordesDao.findAll();
	}
	
	
}
