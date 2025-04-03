package com.multithrding2;

class PetrolPump {
   
    public synchronized void refillCar(String carName)
    {
        try
        {
            System.out.println(carName + " started refilling...");
           
            Thread.sleep(1000);
            System.out.println("| ");
            Thread.sleep(1000);
            System.out.println("| ");
            Thread.sleep(1000);
            System.out.println("| ");
            Thread.sleep(1000);
            System.out.println(carName + " completed refilling!");
        }
        catch (InterruptedException e)
        {
            System.out.println("Refilling interrupted for " + carName);
        }
    }
}

