package com.Treeset_collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;
//01
//public class CollectionExample {
//	public static void main(String[] args) {
//		TreeSet<String> tree = new TreeSet<>();
//		tree.add("25");
//		tree.add("Naresh");
//		tree.add("A");
//		tree.add("37");
//		for(String str: tree)
//			System.out.print(str+" ");
//	}
//}
//Ans-25 37 A Naresh 


//02
//public class CollectionExample {
//	public static void main(String[] args) {
//		Set<String> tree = new TreeSet<>();
//		tree.add("25");
//		tree.add("Naresh");
//		tree.add("A");
//		tree.add("37");
//		for(String str: tree)
//			System.out.print(str+" ");
//	}
//}
//Ans-25 37 A Naresh 


//03
//public class CollectionExample 
//{
//	public static void main(String[] args) {
//		Set<String> tree = new TreeSet<>();
//		tree.add("25");
//		tree.add("Naresh");
//		tree.add("37");
//		tree.add("A");
//		tree.add("37");
//		tree.add("38");
//		for(String str: tree)
//			System.out.print(str+" ");
//	}
//}
//Ans-25 37 38 A Naresh 

//04
//public class CollectionExample {
//	public static void main(String[] args) {
//		Set<String> tree = new TreeSet<>();
//		tree.add("google");
//		tree.add("Naresh");
//		tree.add("Information");
//		tree.add("Technology");
//		for(int i=2;i<tree.size();i++) 
//		{
//			System.out.print(tree.remove(i));
//		}
//	}
//}


//05
//public class CollectionExample {
//	public static void main(String[] args) {
//		Set<String> tree = new TreeSet<>();
//		tree.add("google");
//		tree.add("Naresh");
//		tree.add("Information");
//		tree.add("Technology");		
//		for(String str: tree) 
//		{
//			if(tree.contains("Naresh"))
//				System.out.print(str+" ");
//		}
//	}
//}
//Ans-Information Naresh Technology google 

//06
//public class CollectionExample {
//	public static void main(String[] args) {
//		HashMap hash = new HashMap<>();
//		hash.put("nit", 500);
//		hash.put("info", 644);
//		hash.put("tech", "google");
//		System.out.println(hash.get("tech"));
//		System.out.println(hash.get("google"));
//		System.out.println(hash.getOrDefault("nit", "Technology"));
//		System.out.println(hash.get("info"));
//	}
//}
//Ans-google
//null
//500
//644

//07
//public class CollectionExample {
//	public static void main(String[] args) {
//		HashSet hash = new HashSet<>();
//		hash.add("nit");
//		hash.add("NIT");
//		hash.add("NIT1");
//		System.out.println(hash);
//		System.out.println(hash.size());
//	}
//}
//Ans-[nit, NIT, NIT1]
//	3


//08
//public class CollectionExample {
//	public static void main(String[] args) {
//		HashSet hash = new HashSet<>();
//		hash.add("nit");
//		hash.add("nit");
//		System.out.println(hash);
//		System.out.println(hash.size());
//	}
//}
//Ans-[nit]
//	1

//09
//public class CollectionExample {
//	public static void main(String[] args) {
//		HashSet set = new HashSet<>();
//		set.add(new StringBuffer("nit"));
//		set.add(new StringBuffer("nit"));
//		System.out.println(set);
//		System.out.println(set.size());
//	}
//}
//Ans-[nit, nit]
//2


//10
//public class CollectionExample {
//	public static void main(String[] args) {
//		TreeSet tree = new TreeSet<>();
//		tree.add("nit");
//		tree.add("Naresh");
//		tree.add("25");
//		System.out.println(tree.tailSet("a"));
//	}
//}
//Ans-[nit] grtther than value (ascii)


//11
//public class CollectionExample {
//	public static void main(String[] args) {
//		TreeSet tree = new TreeSet<>();
//		tree.add("nit");
//		tree.add("Naresh");
//		tree.add("Technology");
//		System.out.println(tree.tailSet("a"));
//	}
//}
//Ans-[nit]


//12
//public class CollectionExample {
//	public static void main(String[] args) {
//		SortedMap smap = new TreeMap();
//		smap.put(101,"nit");
//		smap.put(105,"Technology");
//		smap.put(103,"Naresh");
//		System.out.println(smap);
//	}
//}
//Ans-{101=nit, 103=Naresh, 105=Technology}


//13
public class CollectionExample {
	public static void main(String[] args) {
		TreeSet tree = new TreeSet();
		tree.add("nit");
		tree.add("Technology");
		tree.add("Naresh");
		System.out.println(tree.descendingSet());
	}
}

//Ans-[nit, Technology, Naresh]






























