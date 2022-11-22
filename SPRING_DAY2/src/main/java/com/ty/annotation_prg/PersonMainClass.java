package com.ty.annotation_prg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMainClass {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/ty/annotation_prg/config.xml");
		Person person  = applicationContext.getBean("person" ,Person.class);
		person.talk();
	}

}



