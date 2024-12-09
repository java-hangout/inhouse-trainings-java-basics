package org.jh.iht.java.basics.day03;

import org.jh.iht.java.basics.day03.ExceptionsProgram01;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExceptionsProgram01Test {

    /*
     * Problem Statement:
     * Verify that the program correctly handles division by zero.
     * It should return an appropriate error message and indicate that the finally block was executed.
     *
     * Input:
     * a = 10, b = 0
     * 
     * Expected Output:
     * "Error: Division by zero! - Finally block executed."
     */
    
    @Test
    public void testRun() {
        // Run the method with input values
        String result = ExceptionsProgram01.run(10, 0);
        
        // Assert the expected result
        String expected = "Error: Division by zero! - Finally block executed.";
        assertEquals(expected, result);
    }
}