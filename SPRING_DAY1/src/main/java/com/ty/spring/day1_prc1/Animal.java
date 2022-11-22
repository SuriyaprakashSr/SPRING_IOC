package com.ty.spring.day1_prc1;

public interface Animal {
	void eats();

}
class Cow implements Animal{

	public void eats() {
		System.out.println("cow eats grass");		
	}

}
class Lion implements Animal{

	public void eats() {
		System.out.println("Lion eats meat");
	}

}