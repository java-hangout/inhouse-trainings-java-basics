package com.jh.iht.java.basics.exceptions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
Problem Statement:
Demonstrate the use of the **finally block** in exception handling. The task is to ensure that the `finally` block runs whether an exception is thrown or not.

Steps to Implement:
1. **Finally Block**: Implement a method where an exception is caught, and a `finally` block runs after the exception is handled.
2. **Test the behavior** of the `finally` block to ensure it is executed even when an exception occurs.

Test Scenarios:
1. Test the scenario where an exception is thrown and caught, but the `finally` block should still execute.

Expected Output:
1. "Caught ArithmeticException: / by zero"
2. "Finally block always runs"
*/

public class EFinallyBlockTest {

    @Test
    public void testFinallyBlock() {
        FinallyBlockDemo demo = new FinallyBlockDemo();
        String result = demo.demonstrateFinallyBlock();
        assertEquals("Finally block always runs", result);  // Expected: Finally block always runs
    }
}