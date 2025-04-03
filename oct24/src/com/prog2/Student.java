package com.prog2;

public class Student {
	protected String name;
	protected int rollNumber;
	
	public Student(String name, int rollNumber)
	{
		if(rollNumber<=0)
		{
			System.out.println("invalid input");
		}
	
        this.name = name;
		this.rollNumber = rollNumber;
	}
	
	public void displayDetails()
    {
		System.out.println("name:"+name);
		System.out.println("rollNumber:"+rollNumber);
	}
	
	public double calculatePercentage()
	{
		 return 0.0;	
	}
	

}
