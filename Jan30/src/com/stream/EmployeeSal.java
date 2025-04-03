package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSal {

	public static void main(String[] args) {
		{
			List<Employee> listOfEmp = new ArrayList<Employee>();
			List<Employee> filteredList = new ArrayList<Employee>();
			
			
			listOfEmp.add(new Employee(111, "Harun", 20000D));
			listOfEmp.add(new Employee(111, "Sanket", 15000D));
			listOfEmp.add(new Employee(111, "Sai", 50000D));
			listOfEmp.add(new Employee(111, "Nikhil", 90000D));
			listOfEmp.add(new Employee(111, "Amjad", 40000D));
			
			filteredList = listOfEmp.stream().filter(emp -> emp.salary()>50000).collect(Collectors.toList());
			
			filteredList.forEach(emp -> System.out.println(emp.name()));
		}
	}

}
