package com.mcq_map;

import java.util.HashMap;
import java.util.Map;

public class BufferTest1 {
	
		   public static void main(String [] args)
		   {
		        Map<Integer,String> map = new HashMap<>();
			map.put(128,"Ampt");
			map.put(127,"san");
			map.put(new Integer(127),"htd");
			System.out.println(map.size());
		    }

}

//Ans=2  duplicate value is not count


