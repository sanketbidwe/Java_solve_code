package com.testPredicate;


import java.util.Scanner;
import java.util.function.BiConsumer;


public class ValueModifier {

	public static void main(String[] args)
	{   
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		
		BiConsumer<String,Integer> c1 =  (str,num) -> 
		 {
		  System.out.println("Original string:"+str);
		  System.out.println("Original string:"+num);
		  System.out.println("After converting string to uppercase:"+str.toUpperCase());
		  System.out.println("After squaring the integer:"+num*num);
         };

        c1.accept("hello",5);
    
	}

}
