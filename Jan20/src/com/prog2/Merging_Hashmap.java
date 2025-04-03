package com.prog2;



import java.util.HashMap;

public class Merging_Hashmap {

	public static void main(String[] args) 
	{
		HashMap<String ,Integer> hashmap=new HashMap<>();
		hashmap.put("Apple", 20);
		hashmap.put("Banana", 40);
		hashmap.put("Mango", 30);
		System.out.println("1st Hashmap: "+hashmap);
		HashMap<String,Integer> hmap=new HashMap<>();
		hmap.put("laptop", 3);
		hmap.put("mobile", 5);
		hmap.put("Watch", 2);
		System.out.println("2nd Hashmap: "+hmap);

		System.out.println("Merging array:");
		hashmap.putAll(hmap);
		hashmap.forEach((k,v)->System.out.println(k +":"+v));
		System.out.println("-------Abset----------------");
		hashmap.putIfAbsent("grapes", 50);
		hashmap.forEach((k,v)->System.out.println(k+":"+v));
		System.out.println("---------Replace-------------------");
		hashmap.replace("Watch", 2,4);
		hashmap.forEach((k,v)->System.out.println(k+":"+v));
		System.out.println("-------remove----------");
		hashmap.remove("Mango");
		hashmap.forEach((k,v)->System.out.println(k+":"+v));
		System.out.println(hashmap);
		
	}

}