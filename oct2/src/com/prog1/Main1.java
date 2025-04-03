package com.prog1;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System .in);
		System.out.println("Enter the radius:");
		double radius=sc.nextDouble();
		
		String area = Circle.getArea(radius);
		
		float side = Float.parseFloat(area);
		
		System.out.printf("Area of circle:%.2f",side);
		
        sc.close();
	}

}
