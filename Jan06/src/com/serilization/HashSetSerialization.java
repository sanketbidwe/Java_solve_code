package com.serilization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;

public class HashSetSerialization
{
	 public static void serializeHashSet(HashSet<String> set, String filepath) 
	 {
		 var fos = new FileOutputStream(filepath);
			var oos = new ObjectOutputStream(fos);
			try (fos; oos)
			{
				oos.writeObject(fruits);
				System.out.println("Your employees data added in file successfully..");
			} catch (Exception e)
			{
				System.err.println(e.getMessage());
			}
		 
	 }
	 
	 public static HashSet<String> deserializeHashSet(String filename)
	 {
		return null;
		 
	 }
	 
	public static void main(String[] args)
	{
		HashSet<String> fruits = new HashSet<>();
		fruits.add("banana");
		fruits.add("bana");
		fruits.add("ba");
		fruits.add("b");
		 String filepath ="C:\\Users\\HP\\Pictures\\Resume_Folde\\new\\Student1.txt";
		 HashSetSerialization.serializeHashSet(fruits, filepath);
		 HashSetSerialization.deserializeHashSet(filepath);

	}

}
