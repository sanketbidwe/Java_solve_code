package com.prog1bike;

public class Bike extends Vehicle {
	
	private String type;

	public Bike(String make, String model, int year, String type) {
		super(make, model, year);
		this.type = type;
	}
	 
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Type:"+type);
	}

	

}
