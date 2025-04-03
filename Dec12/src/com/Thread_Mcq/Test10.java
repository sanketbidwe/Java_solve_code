package com.Thread_Mcq;

class MyThreadA extends Thread
{
	String s;
	public void run() 
	{ 
//		this.s=;
		for (int i=0;i<5;i++) //chane kel
		{
			System.out.println("s will be printed :"+s);
		}
	}
}
class MyThreadB extends Thread 
{
	String t;
	public void run(String t) 
	{ 
		this.t=t;
		for (;;) 
		{
			System.out.println("t will be printed :"+t);
		}
	}
}
public class Test10
{
public static void main(String [] args) 
{
  MyThreadA t1 = new MyThreadA();
  MyThreadB t2 = new MyThreadB();
		t1.start();
		t2.start();// change
		
	}
}