package com.jh.iht.java.basics.co;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Demonstrate reduced coupling using interfaces and constructor injection.
 * Input:
 * - Engine object (Electric or Gas)
 * - Car object using the Engine
 * Expected Output:
 * - "Electric Engine started" or "Gas Engine started" based on the engine type
 */
public class FReducingCouplingTest {

    @Test
    public void testCarWithElectricEngine() {
        Engine3 electricEngine = new ElectricEngine3();
        Car3 electricCar = new Car3(electricEngine);
        // Capture the output to verify if the engine started
        Assertions.assertEquals("Electric Engine3 started.", electricCar.startCar());
    }

    @Test
    public void testCarWithGasEngine() {
        Engine3 gasEngine = new GasEngine3();
        Car3 gasCar = new Car3(gasEngine);
        // Capture the output to verify if the engine started
        Assertions.assertEquals("Gas Engine3 started.", gasCar.startCar());
    }
}