package com.prog1;

public class Circle extends Shape {
	
double radius;
	
	public Circle(double radius) {
		this.radius=radius;
	}

	@Override
	double getArea() {
		return 3.14*radius*radius;
	}

	@Override
	double printDetails() {
		System.out.println("=========Circle==========");
		System.out.println("Type = Circle");
		System.out.println("Radius = "+radius);
		System.out.println("Area = "+getArea());
		return 0;
	}

}
