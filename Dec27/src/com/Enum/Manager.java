package com.Enum;

public class Manager extends Employee {
	
	private  ManagerType type; 

	public Manager()
	{
		
	}

	public Manager(String name, int employeeId, double salary) {
		super(name, employeeId, salary);
		this.type=type;
	}

	
	public ManagerType getType() {
		return type;
	}

	
	public void setType(ManagerType type) {
		this.type = type;
	}
	
	

	
	
	


}
