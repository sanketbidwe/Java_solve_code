package com.prog1;
//blc
public class Circle {
	public static String getArea(double radius) {
		
		if(radius<=0) 
		{
			
			return ""+(0);
		}
		else 
		{
			final double PI=3.14;
			
			double areaOfCircle= 3.14*radius*radius;
			
			return ""+areaOfCircle;
		}
	}

}
