package com.Straem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConverFisrtLatterUpperCase {

	public static void main(String[] args) {
		List<String> strList =Arrays.asList("abcd" , "efgh" , "jklm" , "xyz");

		strList.stream().map(name->((char)(name.charAt(0)-32))+name.substring(1)).forEach(System.out::println);
	}

}