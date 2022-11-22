package com.ty.annotation_value;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("1")
	private int id;
	@Value("ram")
	private String name;
	@Value("Banglore")
	private String address;
	
	
	public Teacher getTeacher() {
		return teacher;
	}
	@Autowired
	private Teacher teacher;
	
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}




}
