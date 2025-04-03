package com.q1;

import java.util.Scanner;

public class Student {
	 private int studentId;
	    private String studentName;
	    private double studentGPA;
	
	

	public Student(int studentId, String studentName, double studentGPA) {
			super();
			this.studentId = studentId;
			this.studentName = studentName;
			this.studentGPA = studentGPA;
		}

	 public static Student getStudentObject() {
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("Enter Student ID: ");
	        int id = scanner.nextInt();
	        scanner.nextLine(); 
	      
	        System.out.print("Enter Student Name: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter Student GPA: ");
	        double gpa = scanner.nextDouble();
	        
	        return new Student(id,name,gpa);
	 }

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentGPA=" + studentGPA + "]";
	}
	 
	 


}
