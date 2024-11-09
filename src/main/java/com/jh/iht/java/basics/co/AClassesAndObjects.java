package com.jh.iht.java.basics.co;

// Class definition
class Car1 {
    // Attributes (Fields)
    String model;
    int year;

    // Constructor
    public Car1(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Model: " + model + ", Year: " + year);
    }
}

/**
 * @author Veeresh N
 * @version 1.0
 */

public class AClassesAndObjects {
    public static void main(String[] args) {
        // Creating objects (instances of the Car class)
        Car1 car1 = new Car1("Tesla Model 3", 2022);
        Car1 car2 = new Car1("BMW M3", 2023);

        // Accessing methods using objects
        car1.displayDetails();
        car2.displayDetails();
    }
}