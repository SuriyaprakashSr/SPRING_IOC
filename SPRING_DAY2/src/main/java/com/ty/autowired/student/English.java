package com.ty.autowired.student;

import org.springframework.stereotype.Component;

@Component
public class English implements Subjects{
	public void subject() {
		System.out.println("Student is Studying English");		
	}
}
