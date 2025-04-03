package com.stream;

import java.util.stream.Stream;


public class Stream_concat {

	public static void main(String[] args) {
		
		  Stream.of("Hello", "", "World", " ", "from", " ", "Java", "!")
		  .filter(str -> !str.isEmpty()).forEach(System.out::println);
		  


	}

}
