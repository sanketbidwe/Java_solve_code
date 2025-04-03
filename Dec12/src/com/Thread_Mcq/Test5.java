package com.Thread_Mcq;

class SimpleThread extends Thread 
{
   public SimpleThread(String str) 
	{
	super(str);
    }
    public void run() 
	{
	for (int i = 0; i < 10; i++) 
	{
	System.out.println(i + " " + getName());
    try 
	{
	sleep((int)(Math.random() * 10000));
	}
	catch (InterruptedException e) {}
	}
	System.out.println("DONE! " + getName());
    }
}
class Test5
{
public static void main (String args[]) 
    {
        new SimpleThread("J2EE").start();
        new SimpleThread("J2ME").start();
    }
}