package com.q3;



public class Customer {
	 private int customerId;
	 private String customerName;
	 private String customerAddress;
	 private Order order;

	 
	 public Customer(int customerId, String customerName, String customerAddress, Order order) {
	     this.customerId = customerId;
	     this.customerName = customerName;
	     this.customerAddress = customerAddress;
	     this.order = order;
	 }

	 
	 @Override
	 public String toString() {
	     return "Customer ID: " + customerId + ", Customer Name: " + customerName + 
	            ", Customer Address: " + customerAddress + ", Order Details: [" + order + "]";
	 }

}
