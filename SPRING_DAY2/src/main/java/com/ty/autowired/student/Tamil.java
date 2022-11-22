package com.ty.autowired.student;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Tamil implements Subjects{

	public void subject() {
		System.out.println("Student is Studying tamil");		
	}

}
