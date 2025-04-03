package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

//exp.11
//public class Test
//{
//      public static void main(String[] argv) 
//      {
//            List<String> list = new ArrayList<String>();
//            list.add("a");
//            list.add("b");
//            list.add("c");
//            System.out.println(list.indexOf("a"));
//            System.out.println(list.indexOf("c"));
//            System.out.println(list.indexOf("d"));
//      }
//}
//Ans->0 2 -2

//exp.12
public class Test
{
     public static void main(String[] argv) 
     {
           Collection c = new ArrayList();
           c.add("1");
           c.add("2");
           c.add("3");
           Collection c1 = new ArrayList();
           c1.add("1");
//           c1.add("2");
           c.retainAll(c1);
           System.out.println(c);
     }
}
//Ans->[2, 3]


//exp.13
//public class Test
//{
//     public static void main(String[] args)
//     {
//           Integer int1 = new Integer(10);
//           Vector vec1 = new Vector();
//           LinkedList list = new LinkedList();
//           vec1.add(int1);
//           list.add(int1);
//           if(vec1.equals(list)) 
//                System.out.println("equal");
//           else  
//                System.out.println("not equal");
//     }
//}
//Ans->equal

//exp.14
//public class Test
//{
//       public static void main(String[] args) 
//       {
//             List<Number> list = new ArrayList<Number>();
//                  
//             System.out.format("%b %b %b %d",
//                 list.add(7),
//                 list.add(null),
//                 list.add(8),
//                 list.size());
//       }
//}
//Ans->true true true 3

//exp.15
//public class Test
//{
//       public static void main(String[] args) 
//       {
//            List<Number> list = new ArrayList<Number>();
//            list.add(7);
//            list.add(8);
//            list.add(7);
//            Number index = list.get(Integer.valueOf(3));
//            System.out.println(index);
//        }
//}
//Ans->error beacuse index 3 nhi aahe


//exp.16
//public class Test
//{
//       public static void main(String[] args) 
//       {
//            List<String> list1 = new ArrayList<String>();
//		list1.add("Dohni");//0
//		list1.add("Sahwag");//1
//		list1.add("Bumrah");//2
//		list1.set(0, "Virat");//set means dhoni delete hoga
//		list1.add(0, "Rohit");
//		System.out.println(list1);
//       }
//}
//Ans->[Virat, Rohit, Sahwag, Bumrah]


//exp.17
//public class Test
//{
// public static void main(String argv[])
//	 {
//    	 
//    	ArrayList list = new ArrayList(); 
//    	ArrayList listStr = list; 
//    	ArrayList listBuf = list; 
//    	listStr.add(0, "Hello"); 
//    	StringBuffer buff =listBuf.get(0); //cannot convert from Object to StringBuffer
//       System.out.println(buff.toString());
//    }
//
//}


//exp.18
//public class Test
//{
//public static void main(String... args) 
//{
//	ArrayList obj = new ArrayList();
//            obj.add("A");
//            obj.set(0, "B");
//            System.out.println(obj.size());
//        }
//}
//Ans->1


//exp.19
//public class Test
//{
//	public static void main(String[] args) 
//	{
//		Moof one = new Moof(8);
//		Moof two = new Moof(8);
//		if(one.equals(two))
//		{
//		System.out.println("Equal ...");
//		}
//		else
//		{
//		System.out.println("Not Equal ...");
//		}
//	}
//}
//class Moof
//{
//	private int moofValue;
//	Moof(int val)
//	{
//		moofValue=val;
//	}
//
//	public int getMoofValue()
//	{
//		return moofValue;
//	}
//	public boolean equals(Object o)
//	{
//		if((o instanceof Moof)&&(((Moof)o).getMoofValue()==this.moofValue))
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
//
//	}
//}
//Ans->Equal ...

//exp.10
//class Emp 
//{
//	private int age ;
//	
//	public Emp( int age )
//	{
//		super();
//		this.age = age;
//	}
//	
//	public int hashCode()
//	{
//		return age;
//	}
//}
//public class Test
//{
//	public static void main(String[] args) 
//	{
//		Emp emp1 = new Emp(23);
//		System.out.println("emp1.hashCode() is :"+emp1.hashCode());
//
//
//		int originalHashCode = System.identityHashCode(emp1);
//		System.out.println("Original hashCode of Emp is :"+originalHashCode);
//	}
//}
//Ans->emp1.hashCode() is :23
//Original hashCode of Emp is :1590550415






























