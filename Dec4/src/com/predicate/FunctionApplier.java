package com.predicate;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionApplier {
	public static int applyFunction(int value,  Function<Integer, Integer>function)
	{
		return function.apply(value);
		
	}
	public static void main(String[] args) {
		
		 Function<Integer, Integer> add = val -> val + 5; 
	        Function<Integer, Integer> multiply = val -> val * 2; 
	        Function<Integer, Integer> subtract = val -> val - 3; 
	        
//	        Scanner sc = new Scanner(System.in);
//			System.out.print("Enter a number :");
//			int num = sc.nextInt();

	        
	        int sampleValue = 10;
//			int val=add.apply(num);
	        System.out.println("Original value: " + sampleValue);
	        
	        System.out.println("After adding 5: " + applyFunction(sampleValue, add));
	        System.out.println("After multiplying by 2: " + applyFunction(sampleValue, multiply));
	        System.out.println("After subtracting 3: " + applyFunction(sampleValue, subtract));

	}

}
