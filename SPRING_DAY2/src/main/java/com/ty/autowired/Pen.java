package com.ty.autowired;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

interface items{
	void used();
}


@Component
public class Pen implements items{

	
	public void used() {
		System.out.println("pen is used for writing");
	}
}

@Component
@Primary
class Bike implements items{

	
	public void used() {
		System.out.println("bike is used for riding");
	}
}
