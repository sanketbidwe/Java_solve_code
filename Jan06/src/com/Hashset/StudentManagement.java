package com.Hashset;

import java.util.HashSet;
import java.util.Scanner;

public class StudentManagement 
{
	
    public static void main(String[] args) 
		{
        HashSet<String> hashSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
      
        if ( hashSet == null || scanner == null)
        {
            System.out.println("Error.... Error Object is null");
            return;
        }

        while (true) 
		{
            System.out.println("Options:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Student");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1/2/3/4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice <= 0 || choice >= 5) {
                System.out.println("Error.... Invalid choice");
                continue;
            }

            switch (choice) 
			{
                case 1:
                    System.out.print("Enter Student Name: ");
                    String elementToAdd = scanner.next();
                    if (hashSet.add(elementToAdd)) 
					{
                        System.out.println("Student Name added successfully.");
                    } 
					else
					{
                        System.out.println("Element already exists in the HashSet.");
                    }
                    break;
                    
                    case 2:
                    System.out.print("Student Remove: ");
                    String elementToDelete = scanner.next();
                    if (hashSet.remove(elementToDelete)) 
					{
                        System.out.println("Student Remove  successfully.");
                    } 
					else 
					{
                        System.out.println("Element not found in the HashSet.");
                    }
                    break;
                    
                    case 3:
                    System.out.println("Students in the system:");
                    hashSet.forEach(System.out::println);
                    break;
                    
                    case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    
                    default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println(); 
        }
    }
}
