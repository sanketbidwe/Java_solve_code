package com.prog2;

import java.util.Scanner;

public class Employee {
	int employeeId ;
	String employeeName ;
	double employeeSalary;
	
	public void setEmployeeData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee id:");
	    employeeId =sc.nextInt();
	    System.out.println("Enter the employee name:");
	    employeeName =sc.nextLine();
	    employeeName =sc.nextLine();
	    System.out.println("Enter the Employee salary:");
	    employeeSalary =sc.nextDouble();
	}
	    
	    public void getEmployeeData()
	    {
	    	System.out.println("=============================");
	    	System.out.println("employee id is:"+employeeId);
	  	   System.out.println("employee name is:"+employeeName);
	  	   System.out.println("employee salary is:"+employeeSalary);
	    
	    
	   }


}
