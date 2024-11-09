package com.jh.iht.java.basics.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem Statement:
 * Demonstrate **catching exceptions** in Java. Specifically, we will handle an `ArithmeticException` when attempting to divide by zero.
 * - The `Division` class has a `divide` method that throws an `ArithmeticException` if the denominator is zero.
 * Steps to Implement:
 * 1. **Division Class**: Implement the `divide` method that performs division and throws an `ArithmeticException` if the denominator is zero.
 * 2. **Test Exception Handling**: Write tests to ensure that dividing by zero throws the expected exception, and valid divisions produce the correct result.
 * Test Scenarios:
 * 1. Test division with valid inputs.
 * 2. Test division with zero as the denominator, ensuring that `ArithmeticException` is thrown.
 * <p>
 * Expected Output:
 * 1. For valid division (e.g., 10 / 2), it should return the result (5).
 * 2. For division by zero, it should throw an `ArithmeticException` with the message: "Cannot divide by zero."
 */

public class CatchingExceptionsTest {

    @Test
    public void testValidDivision() throws ArithmeticException {
        Division division = new Division();
        int result = division.divide(10, 2);
        Assertions.assertEquals(5, result);  // Expected: 5
    }

    @Test
    public void testDivisionByZero() {
        Division division = new Division();
        try {
            division.divide(10, 0);  // Should throw ArithmeticException
            Assertions.fail("Expected ArithmeticException to be thrown");
        } catch (ArithmeticException e) {
            Assertions.assertEquals("Cannot divide by zero.", e.getMessage());
        }
    }
}