package com.prog2;

public class ScienceStudent extends Student {

	private int physicsMarks; 
	 private int chemistryMarks;
	 private int mathMarks;
	 
	public ScienceStudent(String name, int rollNumber, int physicsMarks, int chemistryMarks, int mathMarks) {
		super(name, rollNumber);
		if(physicsMarks<=0 || chemistryMarks<=0 || mathMarks<=0 )
		{
			System.out.println("Error Invalid Input");
			return;
		}
		
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathMarks = mathMarks;
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		
	System.out.println("physicsMarks:"+physicsMarks);
	System.out.println("chemistryMarks:"+chemistryMarks);
	System.out.println("mathMarks:"+mathMarks);
	
	}

	@Override
	public double calculatePercentage() {
		return (physicsMarks+chemistryMarks+mathMarks)/3.0;
	}
	
	
	
	
	 
	 
	 
}
