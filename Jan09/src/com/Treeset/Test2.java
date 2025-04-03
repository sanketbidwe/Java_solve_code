package com.Treeset;

import java.util.*;

public class Test2 
{
       public static void main(String[] args) 
       {
            TreeSet<Integer> times = new TreeSet<Integer>();
            times.add(705);
            times.add(509);
            times.add(645);
            times.add(830);
            times.add(1010);
            times.add(1100);    
            TreeSet<Integer> subset = new TreeSet<>();
           subset=(TreeSet<Integer>)times.headSet(800);			
            System.out.println(subset);
            System.out.println(subset.first());
            System.out.println(subset.last());

       }
}



//
//import java.util.*;
//
//public class b113 
//{
//       public static void main(String[] args) 
//       {
//            TreeSet<Integer> times = new TreeSet<Integer>();
//            times.add(705);
//            times.add(509);
//            times.add(645);
//            times.add(830);
//            times.add(1010);
//            times.add(1100);    
//            TreeSet<Integer> subset = new TreeSet<Integer>();
//            subset = times.headSet(800);			
//            System.out.println(subset);
//            System.out.println(subset.first());
//            System.out.println(subset.last());
//
//       }
//}
//error-41 line