package org.jh.iht.java.basics.day01;

import org.jh.iht.java.basics.day01.ControlFlowProgram03;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ControlFlowProgram03Test {

    /*
     * Problem Statement:
     * Verify that the method uses both if statements and ternary operators to classify a number as even or odd, and positive or negative.
     *
     * Input:
     * number = -4
     * 
     * Expected Output:
     * "Even and Negative"
     */
    
    @Test
    public void testRun() {
        // Run the method with input values
        String result = ControlFlowProgram03.run(-4);
        
        // Assert the expected result
        String expected = "Even and Negative";
//        String expected = "Even and Positive";
//        String expected = "Odd and Negative";
//        String expected = "Odd and Positive";
        assertEquals(expected, result);
    }
}