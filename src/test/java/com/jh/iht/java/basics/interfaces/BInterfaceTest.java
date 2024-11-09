package com.jh.iht.java.basics.interfaces;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem Statement:
 * The goal of this test is to demonstrate how using interfaces can decouple code, making it more flexible.
 * The `Car` class no longer depends directly on specific `Engine` classes but depends on the `Engine` interface.
 * Input:
 * - Car with GasEngine
 * - Car with ElectricEngine
 * Expected Output:
 * - "Gas Engine started!"
 * - "Electric Engine started!"
 */
public class BInterfaceTest {

    @Test
    public void testStartCarWithGasEngine() {
        Car1 gasCar = new Car1(new GasEngine());
        Assertions.assertEquals("Gas Engine started!", gasCar.startCar());  // This should start the gas engine and print "Gas Engine started!"
    }

    @Test
    public void testStartCarWithElectricEngine() {
        Car1 electricCar = new Car1(new ElectricEngine());
        Assertions.assertEquals("Electric Engine started!", electricCar.startCar());  // This should start the electric engine and print "Electric Engine started!"
    }
}