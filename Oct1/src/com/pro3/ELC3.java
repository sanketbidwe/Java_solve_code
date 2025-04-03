package com.pro3;

import java.util.Scanner;

public class ELC3 {

	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int side = sc.nextInt();
		 int nextMultipleOfHundred = NextMultipleOfHundred.getNextMultipleOfHundred(side);
		 System.out.println("If the givenvaliue "+side+"is:"+nextMultipleOfHundred);
		 	sc.close();
	}
	

}
