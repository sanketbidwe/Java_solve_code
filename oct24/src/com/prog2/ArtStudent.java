package com.prog2;

public class ArtStudent extends Student {
	
	private int historyMarks;
	private int geographyMarks;
	private int englishMarks;
	
	public ArtStudent(String name, int rollNumber, int historyMarks, int geographyMarks, int englishMarks) {
		super(name, rollNumber);
		if(historyMarks<=0 || geographyMarks<=0 || englishMarks<=0)
		{
			System.err.println("Error Invalid Input");
			return ;
		}
		this.historyMarks = historyMarks;
		this.geographyMarks = geographyMarks;
		this.englishMarks = englishMarks;
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		super.displayDetails();
	}

	@Override
	public double calculatePercentage() {
		return (historyMarks+geographyMarks+englishMarks)/3.0;
	}
	
	
	
	
}
