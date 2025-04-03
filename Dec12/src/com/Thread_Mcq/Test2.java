package com.Thread_Mcq;

class Test2
{
    
	public static void main(String []args)
    {
        Thread t = Thread.currentThread();
		System.out.println(t);
        System.out.println("Name of thread  : "+t.getName());
		System.out.println("Id of thread  : "+t.getId());
		System.out.println("Id of thread  : "+t.getPriority());

    } 
}
