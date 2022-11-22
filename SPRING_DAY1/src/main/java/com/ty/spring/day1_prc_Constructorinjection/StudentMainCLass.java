package com.ty.spring.day1_prc_Constructorinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMainCLass {
	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("studentconfig.xml");
		
		Student student = beanFactory.getBean("std",Student.class);
		System.out.println("Student name is "+student.getName());
		System.out.println("Student is is "+student.getId());
		System.out.println("Student phone is "+student.getPhone());

		
	}

}
