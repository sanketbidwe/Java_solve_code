package com.prog2;

public class Fan {
	String name;
	String coil;
	int wings;
	
	public void switchOn() {
		System.out.println("Fan switch on");
		System.out.println("My name is:"+name);
		System.out.println("My coil name:"+coil);
		System.out.println("This is wing "+wings);
	}
	
	public void switchOff() {
		System.out.println("Finally switch off Fan");
		
	}

}
