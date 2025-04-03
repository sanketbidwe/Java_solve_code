package com.prog1;

public class Tester {

	public static void main(String[] args) {
		Student s1 = new Student(123,"john smith",100.0); 
		System.out.println(s1.displayDetails());
		
		DayScholar s2 =new DayScholar(2,"Brian lara",25000.0,5000.0);
		System.out.println(s2.displayDetails());
		double remainingAmountDayScholar=s2.payFee(18000.0);
		System.out.println("Remaining amount to pay is:"+ remainingAmountDayScholar );
		
		Hosteller s3=new Hosteller(3,"sanket bidwe",25000.0,8000.0);
		System.out.println(s3.displayDetails());
		double remainingAmountDayHosteller=s3.payFee(33000.0);
		if(remainingAmountDayHosteller<=0) {
			 System.out.println("All Fees are clear");
		}else {
            System.out.println("Remaining amount to pay is: " + remainingAmountDayHosteller);
        }
		
	}
}
