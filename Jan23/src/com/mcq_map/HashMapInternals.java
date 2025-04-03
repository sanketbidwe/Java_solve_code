package com.mcq_map;

import java.util.HashMap;
import java.util.Map;

public class HashMapInternals 
{
	public static void main(String[] args)
	{
		Map<String,String> map = new HashMap<>();
//		map.put("san","Ampt");
		map.put("Ravi","Ampt");
		map.put(new String("Ravi"),"Hyd");

		System.out.println(map);
        }
}
//Ans={Ravi=Hyd}