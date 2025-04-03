package com.prog3;

public class RoundedSum {
	public static int  sumOfRoundedValues(int a,int b,int c) {
		return round(a) + round(b) +round(c);
	}
     public static int round(int n) {
    	 return(n+5)/10*10;
     }
}
