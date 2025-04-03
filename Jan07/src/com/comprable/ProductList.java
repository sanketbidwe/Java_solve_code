package com.comprable;

import java.util.ArrayList;
import java.util.Collections;

public class ProductList {

	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1001, "Tv", 85000.00));
		productList.add(new Product(1005, "Bulb", 80.00));
		productList.add(new Product(1002, "Remote", 180.00));
		productList.add(new Product(1003, "Chair", 85000.00));
		
		Collections.sort(productList);
		
		productList.forEach(System.out::println);
	}

}