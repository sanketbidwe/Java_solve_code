package com.Thread_Mcq;

class Test15
{
   public static void main(String []argv)
   {
      Thread t = Thread.currentThread();
      System.out.println("Name of current thead : "+t.getName());
      t.setName("First Thread");
      System.out.println("Name of thread after change : "+t.getName());
   } 
}
