package com.prog1;

import java.util.Scanner;

public class Product {
	int productId;
	String productName;
	double productPrice;
	
	public void setProductData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the product id :");
		productId =sc.nextInt();
		System.out.print("Enter the product name :");
		productName =sc.nextLine();
		productName =sc.nextLine();
		System.out.print("Enter the product price :");
		 productPrice =sc.nextDouble();
		
	}
	
   public void getProductInfo() {
	   System.out.println("product id is:"+productId);
	   System.out.println("product name is:"+productName);
	   System.out.println("product salary is:"+productPrice);
   }
   

}
