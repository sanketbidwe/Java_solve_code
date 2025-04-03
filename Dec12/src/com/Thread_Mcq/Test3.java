package com.Thread_Mcq;

 class Test3 {
	 public static void main(String args[])
		{
	    new Thread()
		{
	    public void run()
		{
	      System.out.println("task one");
	    }
	    }.start();

	  new Thread()
	  {
	    public void run()
		{
	      System.out.println("task two");
	    }
	  }.start();
	  
	 }

}
