package com.mcq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

//public class VectorDemo 
//{
//	public static void main(String args[]){
//		Vector obj = new Vector(4,2);
//		obj.addElement(new Integer(3));
//		obj.addElement(new Integer(2));
//		obj.addElement(new Integer(5));
//		System.out.println(obj.elementAt(1));
//		}
//}
//ans-> 2


//exp.2
//public class VectorDemo
//{
//	
//		 public static void main(String args[]) 
//		 {
//		 Vector obj = new Vector(4,2);
//		 obj.addElement(new Integer(3));
//		 obj.addElement(new Integer(2));
//		 obj.addElement(new Integer(5));
//		 System.out.println(obj.capacity());
//		 }
//
//    
//}
//Ans->4

//exp.3
//class VectorDemo 
//{
//public static void main(String args[]) {
//Vector obj = new Vector(4,2);
//obj.addElement(new Integer(3));
//obj.addElement(new Integer(2));
//obj.addElement(new Integer(6));
//obj.insertElementAt(new Integer(8), 2);
//System.out.println(obj);
//}
//
//}
//
//Ans->[3, 2, 8, 6]


//Arry aahe ethun
//exp.5
//class VectorDemo 
//{
//public static void main(String args[]) 
//{
//int array[] = new int [5];
//for (int i = 5; i > 0; i--)
//{
//array[5-i] = i;// 5 4 3 2 1
//}                           // 0  1 2 3 4
//Arrays.fill(array, 1, 4, 8);// 5  8 8 8 1   
//for (int i = 0; i < 5 ; i++)
//{
//System.out.print(array[i]);
//}
//}
//}
//
//Ans->5  8 8 8 1 


//exp.6
//class VectorDemo 
//{
//public static void main(String args[])
//{
//ArrayList obj1 = new ArrayList();
//ArrayList obj2 = new ArrayList();
//obj1.add("A");
//obj1.add("B");
//obj2.add("A");
//obj2.add(1, "B"); 
//System.out.println(obj1.equals(obj2));//compare obj1=obj2 is true
//}
//}
//Ans=True

//exp-07
//public class VectorDemo {
//public static void main(String[] args)
//{
// List<String> list = new ArrayList<String>();
// list.add("Patna");
// list.add(0, "New York");
// list.add("Mumbai");
// list.add(2, "Sydney");
// System.out.println(list);
// }
//}
//Ans->[New York, Patna, Sydney, Mumbai]


//exp-08
//public class VectorDemo {
//public static void main(String[] args)
//{
// List<String> list = new ArrayList<String>();
// list.add("Orange");
// list.add(0, "Banana");
// 
// ArrayList<String> arList = new ArrayList<>();
// arList.add("Apple");//3 no la add hoil
// list.add("Grapes");//list aahe mnun index 2 add hoil
// list.addAll(3, arList);
// System.out.println(list);
// }
//}
//Ans->[Banana, Orange, Grapes, Apple]

//exp-9
//public class VectorDemo {
//public static void main(String[] args)
//{
// ArrayList<String> list = new ArrayList<String>();
// list.add(null);
// list.add(0, "A");
// list.add(3, "B");
// list.add(1, "C");//2 index missing aahe aani index seqence pahije
// System.out.println(list);
// }
//}
//->Error

//exp10
//public class VectorDemo {
//public static void main(String[] args)
//{
// ArrayList<String> list = new ArrayList<String>();
// list.add(null);
// list.add(0, "A");
// list.add(2, "B");
// list.add(1, "C");//ethe null next shift hoil 
// System.out.println(list);
// }
//}
//Ans->[A, C, null, B]


//exp.11
//public class VectorDemo {
//public static void main(String[] args)
//{
// ArrayList<String> list = new ArrayList<String>();
// list.add(null);
// list.add(0, "A");
// list.add(null);
// list.add(2, "B");
// list.add("20");
// list.add(1, "C");
// System.out.println(list);
// }
//}
//Ans->[A, C, null, B, null, 20]


//exp12.same exp.11

//exp.13
//public class VectorDemo {
//public static void main(String[] args)
//{
// ArrayList<String> list = new ArrayList<>();
// list.add(12);
// list.add(16);
// list.add(34);
// list.add(78);
// list.remove(12);
// System.out.println(list);
// }
//}
//Ans->Error(integer pahije and ghetal ethe position nhi tr index dyava lagel 12 evaji)


//exp.14
//public class VectorDemo {
//public static void main(String[] args)
//{
// ArrayList<String> list = new ArrayList<>();
// list.add('a');
// list.add('b');
// list.add('c');
// list.add('d');
// list.remove('c');
// System.out.println(list);
// }
//}
//Ans-> Error (because " dyava lagel string aahe manun)

//exp.15
public class VectorDemo {
public static void main(String[] args)
{
 ArrayList<Integer> list = new ArrayList<>();
 list.add(12);
 list.add(16);
 list.add(34);
 list.add(78);
 list.remove(Integer.valueOf(16));
 System.out.println(list);
 }
}



