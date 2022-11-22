package com.ty.annotation_value;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/ty/annotation_value/config.xml");
		Employee employee = applicationContext.getBean("employee",Employee.class);
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getAddress());
		System.out.println("---------------------");
		System.out.println(employee.getTeacher().getName());
		System.out.println(employee.getTeacher().getSchool());
	}

}
