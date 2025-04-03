package com.prog1;


import java.util.HashMap;

public class FruitInventoryManagement {

	public static void main(String[] args)
	{
		HashMap<String,Integer> hashmap=new HashMap<>();
		hashmap.put("Apple", 50);
		hashmap.put("Banana", 30);
		hashmap.put("Orange", 20);
				System.out.println(hashmap.size());
		if(hashmap.isEmpty())
		{
			System.out.println("It is Empty.");
		}else 
		{
			System.out.println("It is not Empty.");
		}
		hashmap.forEach((k,v)->System.out.println(k+ " Value :" +v));
		if(hashmap.containsKey("Orange"))
		{
			System.out.println("Orange are existing .");
		}else
		{
			System.out.println("orange are not existing.");
		}
	 
		{
			System.out.println();
		}
		if(hashmap.containsValue(20))
		{
			System.out.println("Quantity 20 exists in the records.");
		}else
		{
			System.out.println("Thise Quantity are not Exists. ");
		}
	

	}

}