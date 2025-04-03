package com.Treeset;

import java.util.*;
public class Test12 
{
       public static void main(String args[]) 
       {
            HashSet set = new HashSet();
            String s1 = "abc";
            String s2 = "def";
            String s3 = "";
            set.add(s1);
            set.add(s2);
            set.add(s1);
            set.add(s2);
            Iterator i = set.iterator();
            while(i.hasNext())
            {
                 s3 += (String) i.next();
            }
            System.out.println(s3);
       }
}
