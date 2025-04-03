package com.multithreding;

public class Main {
    public static void main(String[] args) {
        Bakery bakery = new Bakery();

        Baker baker = new Baker(bakery);
        Thread t1 = new Thread(baker);
        t1.start();

        Customer customer1 = new Customer(bakery, "Customer 1");
        Customer customer2 = new Customer(bakery, "Customer 2");
        Customer customer3 = new Customer(bakery, "Customer 3");

        Thread c1 = new Thread(customer1);
        c1.start();
        Thread c2 = new Thread(customer2);
        c2.start();
        Thread c3 = new Thread(customer3);
        c3.start();

        try {
            t1.join();
            c1.join();
            c2.join();
            c3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Bakery operation has finished for the day.");
    }
}
