package com.Straem;

import java.util.Arrays;
import java.util.List;

public class ConvertToUppercase {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Virat","Ad de Villiers", "Dhoni", "Rohit");
		
		strList.stream().map(str -> str.toUpperCase()).forEach(System.out::println);

	}

}