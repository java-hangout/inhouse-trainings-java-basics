package com.jh.igniteprogram.java.basics.day01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClassAndObjectProgram03Test {

    /*
     * Problem Statement:
     * Verify that the method demonstrates abstraction with an animal sound and calculates area using constructor overloading.
     *
     * Input:
     * animalType = "Dog", side = 4
     * 
     * Expected Output:
     * "Animal sound: Woof!, Area of square: 16"
     */
    
    @Test
    public void testRun() {
        // Run the method with input values
        String result = ClassAndObjectProgram03.run("Dog", 4);
        
        // Assert the expected result
        String expected = "Animal sound: Woof!, Area of square: 16";
        assertEquals(expected, result);
    }
}