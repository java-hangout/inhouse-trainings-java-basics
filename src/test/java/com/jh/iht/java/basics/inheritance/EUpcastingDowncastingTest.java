package com.jh.iht.java.basics.inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Demonstrate upcasting and downcasting in Java.
 * Input: - Animal reference holding a Dog object
 * Expected Output: - Dog barks using both upcasting and downcasting
 */
public class EUpcastingDowncastingTest {

    @Test
    public void testUpcastingDowncasting() {
        Animal3 animal = new Dog3();  // Upcasting
        Assertions.assertEquals("Dog barks", animal.speak());  // Outputs: Dog barks

        Dog3 dog = (Dog3) animal;  // Downcasting
        Assertions.assertEquals("Dog barks", dog.speak());  // Outputs: Dog barks
    }
}