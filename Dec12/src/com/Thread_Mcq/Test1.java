package com.Thread_Mcq;

class Test extends Thread
{
	public void run()
	{
		for(int i=0; i<=10; i++)
		{
			System.out.println("Hello Welcome here.."+i);
		}
	}
}
class Test1 
{
	public static void main(String[] args) 
	{
		System.out.println("main stared");
		Test t = new Test();
		Test t1 = new Test();
        t.start();
		System.out.println("ended");
		t1.start();
	}
}

