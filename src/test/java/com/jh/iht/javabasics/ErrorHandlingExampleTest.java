package com.jh.iht.javabasics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ErrorHandlingExampleTest {

    /**
     * Problem: Test the method `demonstrateErrors()` to handle different inputs, including division by zero.
     * Input: a = 10, b = 2
     * Expected Output: The result should be "Result: 6" because sum is 10 + 2 = 12 and 12 / 2 = 6.
     */
    @Test
    public void testDemonstrateErrorsCorrectInput() {
        String result = ErrorHandlingExample.demonstrateErrors(10, 2);
        String expected = "Result: 6";  // 10 + 2 = 12, 12 / 2 = 6
        assertEquals(expected, result);
    }

    /**
     * Problem: Test the method `demonstrateErrors()` for division by zero.
     * Input: a = 10, b = 0
     * Expected Output: The method should return "Error: Division by zero" as b is zero.
     */
    @Test
    public void testDemonstrateErrorsDivisionByZero() {
        String result = ErrorHandlingExample.demonstrateErrors(10, 0);
        String expected = "Error: Division by zero";  // Division by zero should be handled
        assertEquals(expected, result);
    }
}
