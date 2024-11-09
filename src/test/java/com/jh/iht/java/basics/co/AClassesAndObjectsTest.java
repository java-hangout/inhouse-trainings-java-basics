package com.jh.iht.java.basics.co;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Demonstrate creation and usage of classes and objects.
 * Input:- Car objects with model "Tesla Model 3", year 2022 and "BMW M3", year 2023.
 * Expected Output:- Display the car model and year details for both car objects.
 */
public class AClassesAndObjectsTest {

    @Test
    public void testCarDetails() {
        Car1 car1 = new Car1("Tesla Model 3", 2022);
        Car1 car2 = new Car1("BMW M3", 2023);

        // Checking car details
        Assertions.assertEquals("Tesla Model 3", car1.model);
        Assertions.assertEquals(2022, car1.year);
        Assertions.assertEquals("BMW M3", car2.model);
        Assertions.assertEquals(2023, car2.year);
    }
}