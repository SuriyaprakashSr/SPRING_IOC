package com.ty.spring.day1_prc_Dependencyinjection;

public class Student {
	private String name;
	private long phone;
	private Teacher teacher;

	public Student(String name, long phone, Teacher teacher) {
		this.name = name;
		this.phone = phone;
		this.teacher = teacher;
	}

	public String getName() {
		return name;
	}

	public long getPhone() {
		return phone;
	}

	public Teacher getTeacher() {
		return teacher;
	}
	
	
	
	
	
	

}
