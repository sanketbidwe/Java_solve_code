package com.Thread_Mcq;

class Test16 extends Thread
{
public void run()
{
System.out.println("PRINT ME");
}
public static void main(String []str)
{
try
{
for(int i=0;i<9;i++)
{
System.out.println(i);
Thread.sleep(500);
}
}
catch(InterruptedException e)
{
System.out.println("thread exception");
}

Test16 t=new Test16();
t.start();
}
}