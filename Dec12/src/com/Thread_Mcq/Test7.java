package com.Thread_Mcq;

public class Test7 extends Thread
{
	static Thread t;
	public static void main(String [] args)
	{
		try
		{
			t=new Thread(new Test7(),"Ravi");
			t.start();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	public void run()
	{
		for(int i=1; i<5; i++)
		{
			try
			{
				System.out.print(Thread.currentThread().getName()+"");
				t.start();
			}
			catch (Exception e)
			{
				System.out.println(" will not botther about but "+e+" happened "+i+" times");
			}
		}
	}
}

