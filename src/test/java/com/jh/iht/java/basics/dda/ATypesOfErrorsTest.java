package com.jh.iht.java.basics.dda;

import org.junit.jupiter.api.Test;

/**
 * Problem: Demonstrate the different types of errors in Java.
 *
 * Input:
 * - Method to demonstrate a runtime error (division by zero).
 * - Method to demonstrate a logical error (wrong operation).
 * - Syntax error in the method (missing semicolon).
 *
 * Expected Output:
 * - Runtime error: ArithmeticException
 * - Logical error: Incorrect result of addition
 * - Syntax error: Compilation fails
 */
/*
public class ATypesOfErrorsTest {

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        TypesOfErrors errors = new TypesOfErrors();
        errors.divideByZero();  // This should throw ArithmeticException
    }

    @Test
    public void testLogicalError() {
        TypesOfErrors errors = new TypesOfErrors();
        int result = errors.addNumbers(5, 3);
        int expected = 8; // We expect 5 + 3, but the method does subtraction
        assertNotEquals(expected, result);  // This should fail because of a logical error
    }

    // Syntax errors are usually caught during compilation, so no test is needed.
}*/
