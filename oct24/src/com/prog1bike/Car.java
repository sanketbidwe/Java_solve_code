package com.prog1bike;

public class Car extends Vehicle {

	private int numberOfDoors;

	public Car(String make, String madel, int year, int numberOfDoors) {
		super(make, madel, year);
		if(numberOfDoors<=0)
		{
		System.out.println("Error Invalid Input");
		}
		this.numberOfDoors = numberOfDoors;
	}
	
	public void  displayDetails() {
		super.displayDetails();
		System.out.println("Number of doors:"+numberOfDoors);
	}

	
	
	
	
}
