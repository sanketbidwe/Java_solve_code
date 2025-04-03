package com.Serialization;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Scanner;

public class Student implements Serializable
{
	private Integer studentId;
	private String studentName;
	private Double studentFees;
	private LocalDate dateOfAdmission;
	
	public Student(Integer studentId, String studentName, Double studentFees, LocalDate dateOfAdmission) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
		this.dateOfAdmission = dateOfAdmission;
	}
	   
	public static Student getStudentObj() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the studentId:");
		Integer studentId=sc.nextInt();
		
		System.out.println("Enter the studentName:");
		String 	studentName=sc.nextLine();
		 	studentName=sc.nextLine();
		
		System.out.println("Enter the studentFees:");
        double studentFees = Double.parseDouble(sc.nextLine());
        
		System.out.println("Enter the dateOfAdmission (yyyy mm dd):");
		int y=sc.nextInt();
		int m=sc.nextInt();
		int d=sc.nextInt();
		LocalDate  dateOfAdmission=LocalDate.of(y,m,d);
				
		return new Student(studentId,studentName,studentFees,dateOfAdmission);
	}

	/**
	 * @return the studentId
	 */
	public Integer getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}

	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	/**
	 * @return the studentFees
	 */
	public Double getStudentFees() {
		return studentFees;
	}

	
	public void setStudentFees(Double studentFees) {
		this.studentFees = studentFees;
	}

	
	public LocalDate getDateOfAdmission() {
		return dateOfAdmission;
	}

	
	public void setDateOfAdmission(LocalDate dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFees=" + studentFees
				+ ", dateOfAdmission=" + dateOfAdmission + "]";
	}
	
	
  

}
