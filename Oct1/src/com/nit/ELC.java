package com.nit;

import java.util.Scanner;

public class ELC {

	public static void main(String[] args) {

		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the value:");
		int side= sc.nextInt();
		
		int sumOfDigits = TwoDigitsSum.getSumOfDigits(side);
		System.out.println("twodiv of "+side+"is:"+sumOfDigits);
		sc.close();

	}

}
