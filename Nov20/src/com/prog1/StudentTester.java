package com.prog1;

public class StudentTester {

	public static void main(String[] args) {
        ScienceStudent s1 = new ScienceStudent("Sanket", "12th", 85, 90, 80);
        HistoryStudent h1 = new HistoryStudent("Nikhil", "10th", 88, 92);

        System.out.println("Science Student :" + s1.studentName );
        System.out.println(" Percentage: " + s1.getPercentage() + "%");
        System.out.println("History Student :" + h1.studentName );
        System.out.println(" Percentage: " + h1.getPercentage() + "%");
        System.out.println("----------------------------");
        System.out.println("Total Number of Students: " + Student.getTotalNoStudents());

	}

}
