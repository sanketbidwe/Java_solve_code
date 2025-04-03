package com.mcq_map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Test1
{
      public static void main(String[] args)
      {
           NavigableMap<Integer, String> map = new TreeMap<Integer, String>();
           map.firstKey();
           System.out.println(map.size());
      }
}
