package com.jh.iht.java.basics.interfaces;

import org.junit.jupiter.api.Test;

/**
 * Problem Statement:
 * In tightly-coupled code, the classes depend heavily on one another, making changes in one class likely
 * to require changes in the others. The goal of this test is to demonstrate the tightly-coupled nature of the
 * `Car` and `Engine` classes in the previous example.
 * Defined Car with startCar () and Engine with start() method. Create instance of Engine inside constructor of Car.
 * Input: - No specific input is required.
 * Expected Output: - The engine of the car should start when the `startCar()` method is invoked.
 */
public class ATightlyCoupledTest {

    @Test
    public void testStartCar() {
        // Create a Car object which internally creates an Engine object
        Car car = new Car();
        // Call startCar() which should invoke the start() method on the Engine instance
        // We expect the output to be "Engine started!"
        car.startCar();  // This should start the car engine
    }
}