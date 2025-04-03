package com.prog3circle;

public class Circle {

	double radius;
    final double PI=3.14;
	public Circle(double radius) {
		
		this.radius = radius;
	}
	
	public void  getArea()
	{
		double area = PI * radius * radius;
		System.out.println("Area of Circle is :"+area);
	}
}
