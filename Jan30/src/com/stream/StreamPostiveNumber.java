package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPostiveNumber {

	public static void main(String[] args) {
		List<Integer> pos= new ArrayList<Integer>();
		pos=Stream.of(-3,2,-5,6,-1,4).filter(n -> n>0).collect(Collectors.toList());
		
		int sum=0;
		for(int n:pos) {
			sum=sum+(n*n);
		}
		
		System.out.println("Sum of squares of positive numbers: "+sum);
	}

}
