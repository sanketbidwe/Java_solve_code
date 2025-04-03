package com.prog3;

public class VIPTicket extends Ticket {
	
	private  String specialAccess;

	public VIPTicket(String eventName, int seatNumber, double price, String specialAccess) {
		super(eventName, seatNumber, price);
		if(specialAccess==null||specialAccess.isEmpty())
		{
			System.out.println("Error Invalid Input");
			return;
		}
		this.specialAccess = specialAccess;
	}

	/**
	 * @return the specialAccess
	 */
	public String getSpecialAccess() {
		return specialAccess;
	}

	/**
	 * @param specialAccess the specialAccess to set
	 */
	public void setSpecialAccess(String specialAccess) {
		this.specialAccess = specialAccess;
	}
	
	
 
}
