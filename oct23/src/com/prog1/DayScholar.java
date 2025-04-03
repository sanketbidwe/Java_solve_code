package com.prog1;

public class DayScholar extends Student {
	private double transportFee;

	public DayScholar(int studentId, String name, double examFee, double transportFee) {
		super(studentId, name, examFee);
		this.transportFee = transportFee;
	}

	@Override
	public String displayDetails() {
		return "DayScholar [transportFee=" + transportFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + "]";
	}

	@Override
	public double payFee(double amount) {
		double totalFee = examFee + transportFee;
		return totalFee - amount;
	}

	
	

	

	
	

	
	

	
}
