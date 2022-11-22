package com.ty.spring.day1_prc_Dependencyinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeacherMainClass {
	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("teacher.xml");
		Student student= beanFactory.getBean("student" ,Student.class);
		System.out.println(student.getName());
		System.out.println(student.getPhone());
		System.out.println(student.getTeacher().getName());
		System.out.println(student.getTeacher().getSchool());
	}

}
