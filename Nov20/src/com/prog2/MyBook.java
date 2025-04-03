package com.prog2;

public class MyBook extends Book {
     @Override
	void setTitle(String title) {
		 this.title = title;

	}

	@Override
	String getTitle() {
		
		 return "The title of my book is: " + this.title;
	}

}
