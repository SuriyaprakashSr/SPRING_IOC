package com.ty.foodorder;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FoodOrderMainCLass {
	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("foodorder.xml");
		FoodOrder foodOrder = beanFactory.getBean("foodorder",FoodOrder.class);
		Customer customer = foodOrder.getCustomer();
		System.out.println(foodOrder.getId());
		System.out.println(foodOrder.getName());
		System.out.println(foodOrder.getTotalCost());
		System.out.println(foodOrder.getHotelName());
		System.out.println("------------------------");
		System.out.println(customer.getId());
		System.out.println(customer.getName());
		System.out.println(customer.getAddress());
		System.out.println(customer.getPhone());
		System.out.println(customer.getEmail());
		System.out.println(customer.getPassword());
		
		
				
	}

}
