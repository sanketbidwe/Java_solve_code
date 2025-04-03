package com.testPredicate;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionApplier {

	public static void main(String[] args) {
		Function<String, Integer> getStringLength = Str ->
		{
			return Str.length();
		};
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.next();
		
		sc.close();
		
		int value=getStringLength.apply(str);
		System.out.println("Length of String :"+value);


	}

}
