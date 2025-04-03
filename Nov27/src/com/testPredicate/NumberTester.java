package com.testPredicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class NumberTester {

	public static void main(String[] args) {
   Predicate<Integer> p1 = num -> num % 2 ==0;
   
   Predicate<Integer> isPrime = num -> {
       if (num <= 1) return false; 
       for (int i = 2; i <= Math.sqrt(num); i++) 
       {
           if (num % i == 0) return false;
       }
       return true;
   };

		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int num = sc.nextInt();
		
		boolean result = p1.test(num);
		System.out.println("Is "+num+" even ??"+result);
		
		boolean result1= isPrime.test(num);
		System.out.println("Is "+num+" even ??"+result1);
		
		
	
		sc.close();
	}

}
