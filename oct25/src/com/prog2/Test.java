package com.prog2;

public class Test {

	public static void main(String[] args) {
		System.out.println("\ntest case 1");
		Dog invalidDog= new Dog("", true, "Golden Retriever");
		
		System.out.println("\ntest case 2");
		Dog d1= new Dog("Buddy", true, "Golden Retriever");
		System.out.println("\n  Dog Details: ");
		d1.display();
		
	}

}
