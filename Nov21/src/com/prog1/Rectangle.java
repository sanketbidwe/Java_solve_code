package com.prog1;

public class Rectangle extends Shape {

	double length;
	double breadth;
	
	public Rectangle(double length, double breadth) {
		this.breadth=breadth;
		this.length=length;
	}
	
	@Override
	double getArea() {
		
		return length*breadth;
	}

	@Override
	double printDetails() 
	{
		System.out.println("========Rectangle=========");
		System.out.println("Type = Rectangle");
		System.out.println("Length ="+length);
		System.out.println("Breadth ="+breadth);
		System.out.println("Area = "+getArea());
	     return 0;
	}

}
