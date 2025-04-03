package com.Treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Test3 
{
      public static void main(String[] argv) 
      {
           TreeSet set = new TreeSet();
           for (int i = 0; i < 5; i++)
                set.add(Math.random());

           Iterator iter = set.iterator();
           while (iter.hasNext())
                System.out.println(iter.next());

     }
}


//ans
//0.3262531558652215
//0.384932290574298
//0.4587230806239012
//0.4738976632285177
//0.8184403577980528