package com.prog3;

public class Ticket {
	
	private String eventName;
	private int seatNumber;
	private  double price;
	
	public Ticket(String eventName, int seatNumber, double price) {
	if(eventName == null || eventName.isEmpty() ||seatNumber<=0 || price<=0 )
	{
		System.out.println("Error Invalid Input");
		return;
	}
		this.eventName = eventName;
		this.seatNumber = seatNumber;
		this.price = price;
	}

	/**
	 * @return the eventName
	 */
	public String getEventName() {
		return eventName;
	}

	/**
	 * @param eventName the eventName to set
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	/**
	 * @return the seatNumber
	 */
	public int getSeatNumber() {
		return seatNumber;
	}

	/**
	 * @param seatNumber the seatNumber to set
	 */
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
