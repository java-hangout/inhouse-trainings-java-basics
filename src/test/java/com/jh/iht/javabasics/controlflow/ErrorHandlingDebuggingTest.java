package com.jh.iht.javabasics.controlflow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Error Handling and Debugging.
 */
public class ErrorHandlingDebuggingTest {

    /**
     * Test Case: Test divideNumbers method with division by zero.
     * Problem: Handle ArithmeticException when dividing by zero.
     * Input: a = 5, b = 0
     * Expected Output: "Error: Cannot divide by zero"
     */
    @Test
    public void testDivideNumbers() {
        String result = ErrorHandlingDebugging.safeDivide(5, 0);
        assertEquals("Error: Cannot divide by zero", result);
    }




    /**
     * Test Case: Test safeDivide method.
     * Problem: Safe division with valid inputs.
     * Input: a = 10, b = 2
     * Expected Output: "Result: 5"
     */
    @Test
    public void testSafeDivide() {
        String result = ErrorHandlingDebugging.safeDivide(10, 2);
        assertEquals("Result: 5", result);
    }


}
