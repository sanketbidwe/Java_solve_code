package com.Comparator;



import java.util.ArrayList;
import java.util.Collections;

public class CustomerListMain {
	public static void main(String[] args) {
		ArrayList<Customer> cust = new ArrayList<Customer>();
		cust.add(new Customer(777, "John", 2000.9));
		cust.add(new Customer(888, "Alen", 245436.4));
		cust.add(new Customer(111, "Martin", 7000.9));
		cust.add(new Customer(222, "John", 6000.3));
		cust.add(new Customer(444, "Adams", 2000.9));
		
		// sort by using customer number
		System.out.println("Sort by using customer number");
		Collections.sort(cust,(c1,c2)->c1.getCustomerNumber().compareTo(c2.getCustomerNumber()));
		cust.forEach(System.out::println);
		
		System.out.println("Sort by using cust name.");
		Collections.sort(cust,(c1,c2)-> c1.getCustomerName().compareTo(c2.getCustomerName()));
		cust.forEach(System.out::println);
		
		System.out.println("Sort by using bill.");
		Collections.sort(cust, (c1,c2)-> c1.getCustomerBill().compareTo(c2.getCustomerBill()));
		cust.forEach(System.out::println);
	}
}