package com.multithrding2;

public class PetrolPumpSimulation 
{
    public static void main(String[] args)
    {
        PetrolPump petrolPump = new PetrolPump();

        String[] carNames = {"Car1", "Car2", "Car3", "Car4", "Car5"};

        Thread[] carThreads = new Thread[carNames.length];

        for (int i = 0; i < carNames.length; i++)
        {
            Car car = new Car(carNames[i], petrolPump);
            carThreads[i] = new Thread(car);
            carThreads[i].start();
        }

        for (Thread thread : carThreads)
        {
            try
            {
                thread.join();
            } 
            catch (InterruptedException e)
            {
                System.out.println("Thread interrupted: " + thread.getName());
            }
        }

        System.out.println("All cars have completed refilling!");
    }
}
