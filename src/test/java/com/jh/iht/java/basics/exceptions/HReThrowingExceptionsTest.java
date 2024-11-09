package com.jh.iht.java.basics.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/*
Problem Statement:
Demonstrate **re-throwing exceptions**. The task is to catch an exception, log it, and then re-throw it.

Steps to Implement:
1. **Re-throwing Exceptions**: Implement a method that catches an exception, prints it, and re-throws it.
2. **Test the behavior** of exception re-throwing.

Test Scenarios:
1. Test the re-throwing of the exception, ensuring that the exception is caught and re-thrown correctly.

Expected Output:
1. The exception should be re-thrown and caught in the calling code.
*/

public class HReThrowingExceptionsTest {

    @Test
    public void testReThrowException() {
        ReThrowingDemo demo = new ReThrowingDemo();
        try {
            demo.process();  // Expected: Initial exception re-thrown
            fail("Expected Exception to be re-thrown");
        } catch (Exception e) {
            assertEquals("Initial exception", e.getMessage());  // Verify exception message
        }
    }
}