package com.q3;

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
