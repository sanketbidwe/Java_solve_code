package com.serilization;

public class CabCustomerServiceTester {

	public static void main(String[] args) {
		CabCustomer cb=new CabCustomer(1, "sanket", "hyd", "hightechcity", 4, "9090203568");
		CabCustomerService cb1=new CabCustomerService();
		cb1.addCabCustomer(cb);
		//cb1.addCabCustomer(cb);
		cb1.printBill(cb);
		
		System.out.println("----------------------");
		
		CabCustomer cb2=new CabCustomer(2, "nilesh", "pune", "kakad", 6, "915876928");
		cb1.addCabCustomer(cb2);
		cb1.printBill(cb2);
		
		System.out.println("----------------------");

		
		CabCustomer cb3=new CabCustomer(3, "vickyf", "delhi", "chakan", 4, "9090203568");
		cb1.addCabCustomer(cb3);
		cb1.printBill(cb3);
	}

}
