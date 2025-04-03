package com.Comparator;

public class Customer{
	private Integer customerNumber;
	private String customerName;
	private Double customerBill;
	
	public Customer(Integer customerNumber, String customerName, Double customerBill) {
		super();
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.customerBill = customerBill;
	}

	public Integer getCustomerNumber() {
		return customerNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public Double getCustomerBill() {
		return customerBill;
	}

	@Override
	public String toString() {
		return "Customer [customerNumber=" + customerNumber + ", customerName=" + customerName + ", customerBill="
				+ customerBill + "]";
	}

//	---------------------------record is the optional method which reduces whole class code------------------------------
	
	
}