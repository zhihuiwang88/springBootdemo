package com.example.springdemo.pojo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class Ordes implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9063831163629333598L;
	private Integer id;
	private Integer OrderPrice;
	private String Customer;
	private Date OrderDate;
	
	
	
	
	
}
