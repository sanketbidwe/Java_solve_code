package prog1;

public class Student {
	
	  int studentId;
	private String studentName;
	private int marks;
	private char grade;

	
	public void calculateGrade() 
	{
		if(this.marks>=90) 
		{
			this.grade = 'A';
		}
		else if(this.marks>=81 && this.marks<=90) 
		{
			this.grade = 'B';
		}
		else if(this.marks>=71 && this.marks<=80) 
		{
			this.grade = 'C';
		}
		else if(this.marks>=61 && this.marks<=70) 
		{
			this.grade = 'D';
		}
		else if(marks<60)
		{
			this.grade = 'e';
		}
		
	}
	
	public void setStudentData(int studentId,String studentName,int marks)
	{ 
	this.studentId=studentId;
	this.studentName=studentName;
	this.marks=marks;
		
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks + ", grade="
				+ grade + "]";
	}
	
}
