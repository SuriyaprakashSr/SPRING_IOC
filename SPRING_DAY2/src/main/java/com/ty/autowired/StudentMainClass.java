package com.ty.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMainClass {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/ty/autowired/config.xml");
		Student student = applicationContext.getBean("student" ,Student.class);
		
		student.using();
	}

}
