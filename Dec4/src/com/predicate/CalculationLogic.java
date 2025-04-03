package com.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class CalculationLogic {
	public static boolean testPredicate(int number, Predicate<Integer> predicate)
	{
        return predicate.test(number);

	}
	public static void main(String[] args) {
		
		Predicate<Integer> isEven = num -> num % 2 == 0;
        Predicate<Integer> isGreaterThan = num -> num > 10;
        Predicate<Integer> isPrime = num -> 
        {
            if (num <= 1) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
        };

        
//        int sampleNumber = 13;
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int num = sc.nextInt();
		
		boolean result = isEven.test(num);
		System.out.println(num+" is even:"+result);
		
		boolean result1 = isGreaterThan.test(num);
		System.out.println(num+" is greater than 10:"+result1);
		
		boolean result2= isPrime.test(num);
		System.out.println(num+" is prime:"+result2);
		
		
//        System.out.println(sampleNumber + " is even: " + testPredicate(sampleNumber, isEven));
//        System.out.println(sampleNumber + " is greater than 10: " + testPredicate(sampleNumber, isGreaterThanTen));
//        System.out.println(sampleNumber + " is prime: " + testPredicate(sampleNumber, isPrime));

	}

}

