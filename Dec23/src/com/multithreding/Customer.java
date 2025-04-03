package com.multithreding;

public class Customer implements Runnable
{
    private final Bakery bakery;
    private final String customerName;
   
    public Customer(Bakery bakery, String customerName)
    {
        super();
        this.bakery = bakery;
        this.customerName = customerName;
    }
   
    @Override
    public void run()
    {
        try
        {
            while (!bakery.isProductionFinished())
            {
                bakery.buyGoods(customerName);
                Thread.sleep(500); // Simulate time to consume the good
            }
        }
        catch (InterruptedException e)
        {
           // Thread.currentThread().interrupt();
        }
        System.out.println(customerName + " is done shopping for the day.");
    }
}
   
