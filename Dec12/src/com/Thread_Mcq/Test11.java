package com.Thread_Mcq;

public class Test11 extends Thread
{
public static void main(String argv[])
{
Test11 b = new Test11();
//b.run();
b.start();

} 
public void start()
{
	super.start();
for (int i = 0; i < 10; i++)
{
System.out.println("Value of i = " + i); 
}  
}
public void run()
{
	System.out.println("omsai");
}
}