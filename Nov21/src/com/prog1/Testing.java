package com.prog1;

public class Testing {
	public static void main(String[] args) {
		Shape shape = new Rectangle(5,7);
		shape.printDetails();
		shape = new Circle(4);
		shape.printDetails();
		shape = new Triangle(4.1, 2.1);
		shape.printDetails();

	}
}
