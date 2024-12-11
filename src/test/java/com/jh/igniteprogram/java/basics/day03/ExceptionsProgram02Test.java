package com.jh.igniteprogram.java.basics.day03;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExceptionsProgram02Test {

    /*
     * Problem Statement:
     * Verify that the program correctly throws and rethrows an exception when a negative number is passed.
     * The program should catch the exception and throw a new one with a custom message.
     *
     * Input:
     * a = -5
     * 
     * Expected Output:
     * "Caught and rethrown: Negative number is not allowed!"
     */
    
    @Test
    public void testRun() {
        try {
            // Run the method with input values
            ExceptionsProgram02.run(-5);
        } catch (Exception e) {
            // Assert the expected exception message
            assertEquals("Caught and rethrown: Negative number is not allowed!", e.getMessage());
        }
    }
}