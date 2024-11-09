package com.jh.iht.java.basics.exceptions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
Problem Statement:
Demonstrate **catching multiple types of exceptions**. The task is to handle both `ArithmeticException` (when dividing by zero) and a general `Exception`.

Steps to Implement:
1. **Divide Method**: Implement a method that performs division and catches both `ArithmeticException` and a general `Exception`.
2. **Catching Multiple Exceptions**: Write tests to verify that both types of exceptions are properly handled.

Test Scenarios:
1. Test division by zero, ensuring the `ArithmeticException` is caught and the appropriate message is displayed.
2. Test valid division, ensuring no exception is thrown.
   
Expected Output:
1. For division by zero, the message "Error: Division by zero." should be returned.
2. For valid division, the result should be returned without errors.
*/

public class DCatchMultipleExceptionsTest {

    @Test
    public void testArithmeticException() {
        MultipleExceptionHandling handler = new MultipleExceptionHandling();
        String result = handler.divide(10, 0);
        assertEquals("Error: Division by zero.", result);  // Expected result for division by zero
    }

    @Test
    public void testValidDivision() {
        MultipleExceptionHandling handler = new MultipleExceptionHandling();
        String result = handler.divide(10, 2);
        assertEquals("Result: 5", result);  // Expected result for valid division
    }
}