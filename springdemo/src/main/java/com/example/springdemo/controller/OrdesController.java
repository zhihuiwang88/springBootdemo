package com.example.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.springdemo.pojo.Ordes;
import com.example.springdemo.service.OrdesService;

@RequestMapping("/ordes")
@Controller
public class OrdesController {

	@Autowired
	private OrdesService ordesService;
	
	/**
	* http://localhost:8080/ordes/selectAll
	*/
	@GetMapping("/selectAll")
	@ResponseBody
	public List<Ordes> findAll() {
		return ordesService.findAll();
	}
	
}
