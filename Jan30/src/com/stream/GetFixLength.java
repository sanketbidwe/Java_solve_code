package com.stream;

import java.util.ArrayList;
import java.util.List;

public class GetFixLength {

	public static void main(String[] args) {
		
		{
			
			List<String> list = new ArrayList<String>();
			list.add("Toby");
			list.add("Anna");
			list.add("Leroy");
			list.add("Alexa");
			list.add("Tony");
			
			list.stream().filter(str -> str.length()==4).sorted()
			.forEach(System.out::println);
			

		}


	}

}
