package com.nit;
//ELC



public class Main {

	public static void main(String[] args) 
	{
		Welcome c1 = new Welcome(111, "Virat");
     	Welcome c2 = new Welcome();
//		c2.setCustomerId(c1.getCustomerId());
//		c2.setCustomerName(c1.getCustomerName());
//		
		System.out.println(c1);
//     	System.out.println(c2);
		
		System.out.println("After Modification");
		c2.setCustomerId(999);
		c2.setCustomerName("Rohit");
		System.out.println(c1);
		System.out.println(c2);
		

	}

}