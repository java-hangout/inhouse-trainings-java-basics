package com.jh.iht.java.basics.controlFlow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: List all even numbers from 1 to n using continue statement.
 * 
 * Input:
 * - int n = 6
 * 
 * Expected Output:
 * - "2 4 6 "
 */
public class KBreakContinueTest {

    @Test
    public void testListEvenNumbers() {
        KBreakContinue bc = new KBreakContinue();
        int n = 6;
        String expected = "2 4 6 ";  // Expected result: "2 4 6 "
        Assertions.assertEquals(expected, bc.listEvenNumbers(n));
    }
}