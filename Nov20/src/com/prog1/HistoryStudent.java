package com.prog1;

public class HistoryStudent extends Student {
	private int historyMarks;
	private int civicsMarks;
	
	
	public HistoryStudent(String studentName, String studentClass,int historyMarks, int civicsMarks)
	{
		super(studentName, studentClass);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}


@Override
	public int getPercentage() {
		int totalMarks = historyMarks + civicsMarks;
	     return (totalMarks * 100) / 200;
	}

}
