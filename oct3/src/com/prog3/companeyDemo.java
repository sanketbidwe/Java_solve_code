package com.prog3;

public class companeyDemo {

	public static void main(String[] args) {
		Companey raj=new Companey();
		
		raj.name="infosys";
		raj.id=111;
		raj.salary=1200;
		raj.getCompaney();
		
		System.out.println("------------------------");
		
		Companey sai=new Companey ();
        sai.name="TCS";
		sai.id=222;
		sai.salary=1100;
		
		sai.getCompaney();
		
	}

}
