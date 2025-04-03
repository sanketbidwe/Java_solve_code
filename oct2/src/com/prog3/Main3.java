package com.prog3;

import java.util.Scanner;

public class Main3 {
     
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		int num =sc.nextInt();
		
		boolean isEven = EvenOrOdd.isEven(num);
		System.out.println(num+"is Even? :"+isEven);
	
//		System.out.println("Enter the anothr no:");
//		num = sc.nextInt();
//		
//		isEven = EvenOrOdd.isEven(num);
//		System.out.println(num+"is Even ?:"+isEven);
        sc.close();
	}

}
