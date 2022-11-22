package com.ty.spring.day1_prc1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AnimalMainClass {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("Animal.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Lion   lion= beanFactory.getBean("lion" ,Lion.class);
		
		lion.eats();
	}

}
