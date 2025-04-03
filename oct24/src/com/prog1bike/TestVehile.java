package com.prog1bike;

public class TestVehile {

	public static void main(String[] args) {
		
		  System.out.println("Test Case 1:");
	        Car invalidCar = new Car("Audi", "Q8", -2021, 4); 
	        Bike invalidBike = new Bike("Yamaha", "MT-07", 2020, "Sports");

	       
	      System.out.println("\nTest Case 2:");
	      System.out.println("Car Details:");
	        Car car = new Car("Audi", "Q8", 2021, 4);
	       // System.out.println("Car Details:");
	        car.displayDetails();

	       
	        Bike bike = new Bike("Yamaha", "MT-07", 2020, "Sports");
	        System.out.println("\nBike Details:");
	        bike.displayDetails();

	}

}
