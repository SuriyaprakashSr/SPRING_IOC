package com.ty.Interface;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileMainClass {
	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("mobile.xml");
		Mobile mobile = beanFactory.getBean("sumsung",SamSung.class);
		Mobile mobile1 = beanFactory.getBean("iphone",Iphone.class);
		
		mobile.os();
		mobile1.os();
	}

}
