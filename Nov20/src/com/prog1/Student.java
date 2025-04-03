package com.prog1;

abstract class Student {
	protected String studentName;
	protected String studentClass;
	protected static int totalNoOfStudents;
	
	public Student() 
	{
	
	}
	public Student(String studentName, String studentClass)
	{
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
		totalNoOfStudents++;
	}
	
	abstract public int getPercentage( );
	
	public static int getTotalNoStudents( )
	{
		return totalNoOfStudents;
	}

	
	
}



