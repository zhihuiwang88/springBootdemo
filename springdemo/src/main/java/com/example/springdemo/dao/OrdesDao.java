package com.example.springdemo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.springdemo.pojo.Ordes;

@Mapper
public interface OrdesDao {

	List<Ordes> findAll();
	
}
