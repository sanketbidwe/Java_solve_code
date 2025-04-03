package com.testPredicate;

import java.util.Scanner;
import java.util.function.Supplier;

public class RandomValueGenerator {
    static int n=0;
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Name :");
	    String Name=sc.nextLine();
	
		Supplier<String> s1 = () ->
		{
		
		int  num=(int)(Math.random()*10000);
		n=num;
		return Name+num;
		

};
	   
	   System.out.println("Generated random string:"+s1.get());
	   System.out.println("Generated random int:"+n);
	 

}
}
