package com.multithreding;

public class Baker implements Runnable
{
  private Bakery bakery;

    public Baker(Bakery bakery)
    {
        super();
        this.bakery = bakery;
    }
 
    @Override
    public void run()
    {
        try
        {
            while(!bakery.isProductionFinished())
            {
              bakery.bakeGoods();
              Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            //Thread.currentThread().interrupt();
        }
        System.out.println("Baker has finished baking for the day.");
    }
 
}
