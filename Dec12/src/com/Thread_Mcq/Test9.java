package com.Thread_Mcq;

class Parrot implements Runnable
{
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" ");
	}
}
public class Test9
{
	static Parrot p;//nu;

	static { 
		p=new Parrot();
		}

	public Test9()
	{
		super();
		//instance block
		//stm1
		//stm2...
		
	}
	{
		Thread t1= new Thread(p,"Peacock"); 
		t1.start();
	}

	public static void main(String [] args)
	{
		new Test9();

		new Thread( new Runnable()
		{
			public void run()
			{
				System.out.println(Thread.currentThread().getName()+" ");

			}
		},"Koyal").start();

		new Thread(new Parrot(),"Parrot").start();
	}
	

	{
	  Thread t2 = new Thread(p,"Sparrow");
	  t2.start();
	}

	}
//Peacock
//Sparrow
