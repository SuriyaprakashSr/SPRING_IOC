package com.ty.autowired.student;

import org.springframework.stereotype.Component;

@Component
public class Kannada implements Subjects {
	public void subject() {
		System.out.println("Student is Studying kannada");		
	}

}
