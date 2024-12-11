package com.jh.igniteprogram.java.basics.day01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClassAndObjectProgram04Test {

    /*
     * Problem Statement:
     * Verify that the method correctly demonstrates static members by maintaining a shared count.
     *
     * Input:
     * No input, the method simply increments the static count.
     * 
     * Expected Output:
     * "Current count: 2"
     */
    
    @Test
    public void testRun() {
        // Run the method
        String result = ClassAndObjectProgram04.run();
        
        // Assert the expected result
        String expected = "Current count: 2";
        assertEquals(expected, result);
    }
}