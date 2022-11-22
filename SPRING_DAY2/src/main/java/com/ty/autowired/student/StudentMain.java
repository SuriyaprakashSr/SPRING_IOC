package com.ty.autowired.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/ty/autowired/student/config.xml");
		Student student = applicationContext.getBean("student" ,Student.class);
		student.subjectStudying();
	}

}
