package com.jh.iht.java.basics.exceptions;

/**
Problem Statement:
Demonstrate the **Exceptions Hierarchy** in Java by creating a base exception (`BaseException`) and a derived exception (`SpecificException`).
- The `Demo` class uses `SpecificException` to handle specific cases where a negative value is provided.

Steps to Implement:
1. **Base Exception**: Create a custom base exception `BaseException`.
2. **Derived Exception**: Create a derived class `SpecificException` that extends `BaseException`.
3. **Test the exception hierarchy** by throwing and catching `SpecificException`.

Test Scenarios:
1. Test valid action that does not throw any exception.
2. Test invalid action that throws a `SpecificException` when the value is negative.

Expected Output:
1. For a valid action, it should print: "Action performed with value: 10"
2. For invalid input (negative value), it should throw `SpecificException` and print: "Negative value is not allowed."
*/

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BExceptionHierarchyTest {

    @Test
    public void testValidAction() throws SpecificException {
        Demo demo = new Demo();
        demo.performAction(10);  // Expected output: Action performed with value: 10
    }

    @Test
    public void testInvalidAction() {
        Demo demo = new Demo();
        try {
            demo.performAction(-5);  // Should throw SpecificException
            Assertions.fail("Expected SpecificException to be thrown");
        } catch (SpecificException e) {
            Assertions.assertEquals("Negative value is not allowed.", e.getMessage());
        }
    }
}