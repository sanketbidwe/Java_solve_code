package com.prog3;

public class StudentTicket extends Ticket {
	
	private boolean studentDiscount;

	public StudentTicket(String eventName, int seatNumber, double price, boolean studentDiscount) {
		super(eventName, seatNumber, price);
		
		this.studentDiscount = studentDiscount;
		return;
	}

	/**
	 * @return the studentDiscount
	 */
	public boolean isStudentDiscount() {
		return studentDiscount;
	}

	/**
	 * @param studentDiscount the studentDiscount to set
	 */
	public void setStudentDiscount(boolean studentDiscount) {
		this.studentDiscount = studentDiscount;
	}
	
	
	

}
