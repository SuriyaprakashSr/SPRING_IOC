package com.ty.Interface;

public interface Mobile {
	void os();

}
class SamSung implements Mobile{

	public void os() {
		System.out.println("SumSung os");
	}

}
class Iphone implements Mobile{

	public void os() {
		System.out.println("iphone os");		
	}


}