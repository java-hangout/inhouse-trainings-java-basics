package com.jh.igniteprogram.java.basics.day03;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CustomExceptionsAndErrorsProgram01Test {

    /*
     * Problem Statement:
     * Verify that the program throws a custom exception when the age is less than 18.
     * It should return the custom error message defined in the `InvalidAgeException` class.
     *
     * Input:
     * age = 16
     * 
     * Expected Output:
     * "Age must be 18 or older!"
     */
    
    @Test
    public void testRun() {
        // Run the method with input values
        String result = CustomExceptionsAndErrorsProgram01.run(16);
        
        // Assert the expected result
        String expected = "Age must be 18 or older!";
        assertEquals(expected, result);
    }
}