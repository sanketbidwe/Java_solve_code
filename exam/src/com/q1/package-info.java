package com.q1;
import java.util.Scanner;

class Student {
    
    private int studentId;
    private String studentName;
    private double studentGPA;

    public Student(int studentId, String studentName, double studentGPA) {
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

        return new Student(id, name, gpa);
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + studentName + ", GPA: " + studentGPA;
    }
}

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            students[i] = Student.getStudentObject();
        }

        System.out.println("\nStudent Details:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
