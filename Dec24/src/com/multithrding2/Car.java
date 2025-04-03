package com.multithrding2;

class Car implements Runnable {
    private String name;
    private PetrolPump petrolPump;

    public Car(String name, PetrolPump petrolPump)
    {
        this.name = name;
        this.petrolPump = petrolPump;
    }

    @Override
    public void run()
    {
        petrolPump.refillCar(name);
    }
}

