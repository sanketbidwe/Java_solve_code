package com.prog3;

public class MainTicket {

	public static void main(String[] args) {
		System.out.println("Test Case 1");
		  Ticket regularTicket = new Ticket("Concert", -101, 50.0);
		  VIPTicket vipTicket = new VIPTicket("VIP Concert", 201, 100.0, "Backstage Access");
		  StudentTicket studentTicket = new StudentTicket("Student Event", 301, 30.0, true);

		  System.out.println("Test Case 2");
		  Ticket regularTicket = new Ticket("Concert", 101, 50.0);
		  regularTicket.
		  VIPTicket vipTicket = new VIPTicket("VIP Concert", 201, 100.0, "Backstage Access");
		  StudentTicket studentTicket = new StudentTicket("Student Event", 301, 30.0, true);

		  
	}

}
