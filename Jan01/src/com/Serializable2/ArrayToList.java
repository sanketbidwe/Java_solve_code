package com.Serializable2;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList
{
	public static List<String> convertToList(String [] input)
	{ 
		/*
		 * List<String> asList = Arrays.asList(input);
		 * 
		 * return asList;
		 */
		
		List<String> list=new ArrayList<>();
		
		for(String data : input) {
			list.add(data);
		}
		
		//System.out.println(list);
		return list;
	
	}
	public static void main(String[] args)
	{
		String[] input= {"rajesh","Ravan"};
		List<String> list = ArrayToList.convertToList(input);
		System.out.println(list);
	}
}
