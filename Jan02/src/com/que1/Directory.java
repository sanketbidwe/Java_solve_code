package com.que1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Directory {
	public final String filepath = "C:\\Users\\HP\\Pictures\\Resume_Folde\\new\\Employee.txt";

	public void addEmployee(List<Employee> list) throws IOException
	{
		var fos = new FileOutputStream(filepath);
		var oos = new ObjectOutputStream(fos);
		try (fos; oos)
		{
			oos.writeObject(list);
			System.out.println("Your employees data added in file successfully..");
		} catch (Exception e)
		{
			System.err.println(e.getMessage());
		}
	}

	public void displayAllEmployees() throws IOException {
		var fis = new FileInputStream(filepath);
		var ois = new ObjectInputStream(fis);
		try (fis; ois)
		{
			System.out.println("All Employees: ");
			List<Employee> employees = (List<Employee>) ois.readObject();
			employees.forEach(System.out::println);
		} catch (Exception e)
		{
			System.err.println(e.getMessage());
		}
	}

	public void updateEmployee(int index, Employee emp) throws IOException
	{
		var fis = new FileInputStream(filepath);
		var ois = new ObjectInputStream(fis);
		try (fis; ois)
		{
			List<Employee> employees = (List<Employee>) ois.readObject();//list
			if (index >= 0 && index < employees.size())
			{
				employees.set(index, emp);
				var fos = new FileOutputStream(filepath);
				var oos = new ObjectOutputStream(fos);
				try (fos; oos)
				{
					oos.writeObject(employees);
					System.out.println("Your employees data updated in file successfully..");
				}
				catch (Exception e)
				{
					System.err.println(e.getMessage());
				}
			}
			else
			{
				System.out.println("Your index not found in the list...");
			}
		} catch (Exception e)
		{
			System.err.println(e.getMessage());
		}
	}

	public void delete(int index) throws IOException{
		var fis = new FileInputStream(filepath);
		var ois = new ObjectInputStream(fis);
		try (fis; ois) 
		{
			List<Employee> employees = (List<Employee>) ois.readObject();//list
			if (index >= 0 && index < employees.size())
			{
				employees.remove(index);
				var fos = new FileOutputStream(filepath);
				var oos = new ObjectOutputStream(fos);
				try (fos; oos)
				{
					oos.writeObject(employees);
					System.out.println("Deleted successfully from file..");
				} catch (Exception e)
				{
					e.printStackTrace();
					System.err.println(e);
					System.err.println(e.getMessage());
				}
			}
			else
			{
				System.out.println("Your index not found in the list...");
			}
	 } 
		catch (Exception e)
		{
			e.printStackTrace();
			System.err.println(e);
			System.err.println(e.getMessage());
		}
	}
}