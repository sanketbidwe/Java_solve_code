package com.prog2;

public class Dog extends Mammal {
	private String  breed;

	public Dog(String name, boolean hasFur, String breed) {
		super(name, hasFur);
		if (breed == null || breed.isEmpty()) {
            System.out.println("Error Invalid Input");
            return;
        }
		this.breed = breed;
	}

	
	public String getBreed() {
		return breed;
	}

	
	public void setBreed(String breed) {
		if (breed == null ||breed.isEmpty()) {
            System.out.println("Error Invalid Input");
            return;
        }
		this.breed = breed;
	}


	
	@Override
	public void display() {
		
		super.display();
		System.out.println(" Breed:"+breed);
	}




	
	

	
	


	
	
	
}
