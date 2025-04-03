package com.prog2;

public class Animal {
	
	private String name;

	public Animal(String name) {
		if (name == null || name.isEmpty()) {
            System.out.println("Error Invalid Input");
            return;
        }
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.isEmpty()) {
            System.out.println("Error Invalid Input");
            return;
        }
		this.name = name;
	}

	public void display() {
		System.out.println("Animal Name:"+name);
	}

	
    
}
