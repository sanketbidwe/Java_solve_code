package com.prog2;

public class Mammal extends Animal {
	
	private boolean hasFur;

	public Mammal(String name, boolean hasFur) {
		super(name);
		
		this.hasFur = hasFur;
	}

	
	public boolean isHasFur() {
		return hasFur;
	}

	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}


	@Override
	public void display() {
		
		super.display();
		System.out.println("Has Fur:"+(hasFur ? "Yes" : "No"));
	}
	
}
