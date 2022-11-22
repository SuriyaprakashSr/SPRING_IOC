package com.ty.spring.day1_prc_Constructorinjection;

public class Student {
	private int id;
	private String name;
	private long phone;
	
	
	Student(int id,String name,long phone){
		this.id = id;
		this.name=name;
		this.phone=phone;
	}
	
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public long getPhone() {
		return phone;
	}
	
	
	
}
