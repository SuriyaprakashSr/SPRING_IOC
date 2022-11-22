package com.ty.spring.day1_prc2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMainCLass {
	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("employeeconfig.xml");
		Employee employee = beanFactory.getBean("emp" ,Employee.class);
		System.out.println("Employee Name : " +employee.getId());
		System.out.println("Employee id : " +employee.getName());
		System.out.println("Employee phone : " +employee.getPhone());
		System.out.println("Employee address: " +employee.getAddress());
		
	}

}
