package com.Thread_Mcq;

class Test8 
{
	public static void main(String[] args) 
	{		
		try
		{
			Horse h = new Horse();
			Thread t1= new Thread(h,"MyHorse");
			Thread t2= new Thread(h,"YourHorse");
			new Test8().go(t2);
			t1.start(); t2.start();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

				
	}
	void go(Thread t)
	{
		t.start();
	}
	
}
class Horse implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" ");
	}
}