package org.jh.iht.java.basics.day01;

import org.jh.iht.java.basics.day01.ControlFlowProgram02;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ControlFlowProgram02Test {

    /*
     * Problem Statement:
     * Verify that the run method correctly uses logical operators to check if both, one, or neither condition is true.
     *
     * Input:
     * a = true, b = false
     * 
     * Expected Output:
     * "One of them is true"
     */
    
    @Test
    public void testRun() {
        boolean flag1 = true, flag2 = false;
        // Run the method with input values
        String result = ControlFlowProgram02.run(flag1, flag2);
        // Assert the expected result
        String expected = "One of them is true";
//        String expected = "Both are true";
//        String expected = "Both are false";
        assertEquals(expected, result);
    }
}