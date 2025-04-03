package com.Treeset;

import java.util.*;
class  Test8
{
	public static void main(String[] args) {
    SortedSet<Integer> set = new TreeSet<Integer>();
    set.add(7);
    set.add(-12);
    SortedSet<Integer> sub = set.subSet(-8, 100);
    sub.add(9);
    sub.add(10);
    sub.add(11);
    System.out.format("%d %d", set.size(), sub.size());
//    System.out.format("%d ", set.size());
}

}


