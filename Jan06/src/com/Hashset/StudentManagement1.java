package com.Hashset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentManagement1 {
    private Set<String> students = new HashSet<>();

    
    public void addStudent(String name) {
        if (students.add(name)) {
            System.out.println("Student added: " + name);
        } else {
            System.out.println("Duplicate student name: " + name);
        }
    }

    public void removeStudent(String name) {
        if (students.remove(name)) {
            System.out.println("Student removed: " + name);
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the system.");
        } else {
            System.out.println("Students in the system:");
            for (String student : students) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) 
    {
        StudentManagement1 obj = new StudentManagement1();
        Scanner sc = new Scanner(System.in);

        if (obj == null || sc == null)
        {
            System.out.println("Error.... Error Object is null");
            return;
        }

        while (true) {
            System.out.println("\n1. Add a Student");
            System.out.println("2. Remove a Student");
            System.out.println("3. Display Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Clear the newline

            if (choice <= 0 || choice >= 5) {
                System.out.println("Error.... Invalid choice");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String addName = sc.nextLine();
                    obj.addStudent(addName);
                    break;
                    
                case 2:
                    System.out.print("Enter student name: ");
                    String removeName = sc.nextLine();
                    obj.removeStudent(removeName);
                    break;
                    
                case 3:
                    obj.displayStudents();
                    break;
                    
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                    
                default:
                    System.out.println("Error.... Invalid choice");
            }
        }
    }
}

