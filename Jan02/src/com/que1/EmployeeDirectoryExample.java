package com.que1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeDirectoryExample
{

	public static void main(String[] args) throws IOException 
	{
		Directory directory = new Directory();
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee("Alice", "Fresher Developer", 30000.0));
		employeeList.add(new Employee("Bob", "Senior Developer", 60000.0));
		employeeList.add(new Employee("John", "Manager", 75000.0));
		
		directory.addEmployee(employeeList);

		directory.displayAllEmployees();

		directory.updateEmployee(0, new Employee("Alice", "Java Developer", 40000.0));

		directory.displayAllEmployees();

		directory.delete(1);
		directory.displayAllEmployees();
	}

}
