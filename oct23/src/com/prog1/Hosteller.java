package com.prog1;

public class Hosteller extends Student {
 private double hostelFee;

public Hosteller(int studentId, String name, double examFee, double hostelFee) {
	super(studentId, name, examFee);
	this.hostelFee = hostelFee;
}

@Override
public String displayDetails() {
	return "Hosteller [hostelFee=" + hostelFee + ", studentId=" + studentId + ", name=" + name + ", examFee=" + examFee
			+ "]";
}

@Override
public double payFee(double amount) {
	double totalFee= examFee+hostelFee;
	return totalFee-amount;
}
}
 

