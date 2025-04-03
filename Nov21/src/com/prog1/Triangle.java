package com.prog1;

public class Triangle extends Shape {
	
	double base;
	double height;
	
	public Triangle(double base, double height) {
		this.base=base;
		this.height=height;
	}

	@Override
	double getArea() {
		return (1/2)*base*height;
		
	}

	@Override
	double printDetails() {
		System.out.println("===========Triangle==========");
		System.out.println("Type = Triangle");
		System.out.println("Base = "+base);
		System.out.println("Height = "+height);
		System.out.println("Area = "+getArea());	
		return 0;
	}

}
