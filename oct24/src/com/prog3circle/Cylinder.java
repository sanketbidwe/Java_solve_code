package com.prog3circle;

public class Cylinder extends Circle {
	
	double height;

	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	

	public void  getArea()
	{
		double volume= PI*height* radius * radius;
		System.out.println("volume :"+volume);
	}

}
