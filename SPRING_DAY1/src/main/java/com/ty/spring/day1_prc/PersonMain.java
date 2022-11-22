package com.ty.spring.day1_prc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {
	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("config.xml");
		Person person = (Person)beanFactory.getBean("person");
		Person person1 = (Person)beanFactory.getBean("person");
		System.out.println(person);
		System.out.println(person1);
	}

}
