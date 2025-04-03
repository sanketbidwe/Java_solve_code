package com.mcq_map;

import java.util.HashMap;
import java.util.Map;

public class Test2
{
      public static void main(String[] args) 
      {
           Map<String, Integer> map = new HashMap<String, Integer>();
           map.put("T", 1);
           map.put("M", 2);
           map.keySet().add("A",3);
           System.out.println(map.size());
     }
}
