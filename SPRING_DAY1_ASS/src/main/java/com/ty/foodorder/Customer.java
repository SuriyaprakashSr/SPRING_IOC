package com.ty.foodorder;

public class Customer {
	private int id;
	private String name;
	private String address;
	private long phone;
	private String email;
	private String password;
	public Customer(int id, String name, String address, String email, String password, long phone) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.password = password;
		this.phone=phone;
		
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public long getPhone() {
		return phone;
	}
	
	
	
	
}
