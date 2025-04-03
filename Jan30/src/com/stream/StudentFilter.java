package com.stream;

import java.util.ArrayList;
import java.util.List;

public class StudentFilter {

	public static void main(String[] args) {
		
		List<Student>students = new ArrayList<Student>(); 
		
		students.add(new Student("Alice", "Java"));
		students.add(new Student("Bob", "Python"));
		students.add(new Student("Charlie", "Java"));
		students.add(new Student("David", "C++"));
		students.add(new Student("David", "C++"));
		
		students.stream().filter(str -> str.cource()=="Java").forEach(System.out::println);      
	}

}
