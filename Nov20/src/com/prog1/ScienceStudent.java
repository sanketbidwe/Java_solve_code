package com.prog1;

public class ScienceStudent extends Student {
	
	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;
	
	
	public ScienceStudent (String studentName, String studentClass, int physicsMarks, int chemistryMarks, int mathsMarks)
	{
		super(studentName ,studentClass);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}

    @Override
	public int getPercentage() {
		
	 int totalMarks = physicsMarks + chemistryMarks + mathsMarks;
     return (totalMarks * 100) / 300; 
	}

}
