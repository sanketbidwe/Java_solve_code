package com.prog1;

public class Student {
	protected int studentId;
	protected String name;
	protected double examFee;
	
	public Student(int studentId,String name,double examFee) 
	{
	
		this.studentId=studentId;
		this.name=name;
		this.examFee=examFee;
	}
	
	public String displayDetails()
	{
		return "Student[name="+name+"studentId="+studentId+"examFee="+examFee+"]";
	}

	public double payFee(double amount)
	{
	  return  examFee-amount;
	}

	@Override
	public String toString() {
		return displayDetails();
	}
	
	
	

	
	
}
