package com.pro2;

import java.util.Scanner;

public class ELC2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the valiue:");
		int side=sc.nextInt();
		int DiffOfDigits=TwoDigitsDifference.getDiffOfDigits(side);
		System.out.println("If the given valiue is"+side+"return:"+DiffOfDigits);
		sc.close();
		
		
	}

}
