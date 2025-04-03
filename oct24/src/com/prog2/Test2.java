package com.prog2;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("\ntest case 1");
		ScienceStudent invalidScience=new ScienceStudent("Anjali", 101, 85, -90, 80);
		ArtStudent invalidArt= new ArtStudent("Aryan", 102, 75, 80, 85);
		
		System.out.println("\ntest case 2");
		ScienceStudent scienceStudent = new ScienceStudent("Anjali", 101, 85, 90, 80);
		System.out.println("\nScience Student Details:");
		scienceStudent.displayDetails();
		System.out.println("percentage:"+scienceStudent.calculatePercentage());
		
		 ArtStudent artsStudent = new ArtStudent("Aryan", 102, 75, 80, 85);
		 System.out.println("\n Arts Student Details:");
		 artsStudent.displayDetails();
		 System.out.println("percentage:"+artsStudent.calculatePercentage());
	}
	

}
