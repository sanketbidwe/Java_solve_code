package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//exp.1
//public class CollectionExample {
//	public static void main(String[] args) {
//		List<String> list = Arrays.asList("goolge", "nareshIT","NareshIT","progress");
//		Collections.reverse(list);
//		for(String str: list)
//			System.out.print(str+" ");
//	}
//}
//Ans->progress NareshIT nareshIT goolge 



//exp.2
//public class CollectionExample {
//	public static void main(String[] args) {
//		ArrayList<String> al = new ArrayList<>();
//		al.add("25");
//		al.add("Naresh");
//		al.add("A");
//		al.add("37");
//		Iterator<String> it = al.iterator();
//		while(it.hasNext())
//			System.out.print(it.next()+" ");
//	}
//}
//Ans->25 Naresh A 37


//exp.3
//public class CollectionExample {
//	public static void main(String[] args) {
//		ArrayList<String> al = new ArrayList<>();
//		al.add("25");
//		al.add("Naresh");
//		al.add("A");
//		al.add("37");
//		Iterator<String> it = al.iterator();
//		while(it.hasNext())
//			System.out.print(it+" ");
//	}
//}
//Ans->error

//exp.4
//public class CollectionExample {
//	public static void main(String[] args) {
//		ArrayList<String> al = new ArrayList<>();
//		al.add("25");
//		al.add("Naresh");
//		al.add("A");
//		al.add("37");
//		al.remove(4);
//		for(String str: al)
//			System.out.print(str+" ");
//	}
//}
//Ans->ArrayIndexOutofBoundException
 
//exp.5
//public class CollectionExample {
//	public static void main(String[] args) {
//		ArrayList<Integer> al = new ArrayList();
//		for(int i=0;i<10;i++) 
//		{
//			al.add(i);
//		}
//		for(int str: al)
//			System.out.print(str+" ");
//	}
//}
//Ans->0 1 2 3 4 5 6 7 8 9

//exp.6
//public class CollectionExample {
//	public static void main(String[] args) {
//		ArrayList<Integer> al = new ArrayList();
//		for(int i=5;i<10;i++) 
//		{
//			al.add(i);
//		}
//		al.remove(4);
//		for(int str: al)
//			System.out.print(str+" ");
//	}
//}
//Ans->5 6 7 8


//exp.7
//public class CollectionExample {
//	public static void main(String[] args) {
//		ArrayList<String> al = new ArrayList<>();
//		al.add("google");
//		al.add("Naresh");
//		al.add("Information");
//		al.add("Technology");
//		for(int i=0;i<al.size();i++) 
//		{
//			System.out.print(al.get(i).substring(0,6));
//		}
//	}
//}
//Ans->google Naresh Inform Techno

//exp.8
//public class CollectionExample {
//	public static void main(String[] args)
//	{
//		ArrayList<String> al = new ArrayList<>();
//		System.out.println(al);
//	}
//}
//Ans->[]


//exp.9
//public class CollectionExample {
//	public static void main(String[] args) {
//		ArrayList al = new ArrayList<>();
//		al.add(5);
//		al.add("");
//		al.add(10);
//		System.out.println(al.contains(6));
//		System.out.println(al.contains(10));
//		System.out.println(al.contains(null));
//	}
//}
//Ans->false true false

//exp.10
//public class CollectionExample {
//	public static void main(String[] args) {
//		ArrayList al = new ArrayList<>();
//		al.add(50);
//		al.add(25);
//		ListIterator li = al.listIterator();
//		while(li.hasNext())
//		System.out.println(li.next());// 50 25 
//		li.add(22);
//		System.out.println(li.hasNext());
//	}
//}
//Ans->50 25 false


//exp.11






































































































