package com.ty.foodorder;

public class FoodOrder {
	private int id;
	private  String name;
	private long totalCost;
	private String hotelName;
	private Customer customer;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public long getTotalCost() {
		return totalCost;
	}
	public String getHotelName() {
		return hotelName;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTotalCost(long totalCost) {
		this.totalCost = totalCost;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	

}
