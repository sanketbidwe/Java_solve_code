package com.q1;

public class Test {

	public static void main(String[] args) {
		
		 Student[] s1 = new Student[5];

	        for (int i = 0; i < 5; i++) {
	            System.out.println("Enter details Student " + (i + 1) + ":");
	            s1[i] = Student.getStudentObject();
	        }

	        System.out.println("\nStudent Details:");
	        for (Student student : s1) {
	            System.out.println(student);
	        }

	}

}
