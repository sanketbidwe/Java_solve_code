package com.mcq_map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample 
{
   public static void main(String[] args) 
     {
	
        Map<String, Integer> map = new HashMap<>();
	map.put("apple", 1);
	map.put("banana", 2);
	map.put("orange", 3);

	map.replaceAll((k, v) -> v * 2);

	System.out.println(map);
     }
}