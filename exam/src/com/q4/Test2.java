package com.q4;

public class Test2 {

	public static void main(String[] args) {
		
		 Sports football = new Sports("Football", 11);
	     football.displayInfo();

	     System.out.println("---------------------");

	     
	     Sports volleyball = new Sports("Volleyball", -1);
	     volleyball.displayInfo();
		
	}

}



public class Order {
 private int orderId;
 private String itemName;
 private double itemPrice;

 
 public Order(int orderId, String itemName, double itemPrice) {
     this.orderId = orderId;
     this.itemName = itemName;
     this.itemPrice = itemPrice;
 }

 
 @Override
 public String toString() {
     return "Order ID: " + orderId + ", Item Name: " + itemName + ", Item Price: " + itemPrice;
 }
}


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

