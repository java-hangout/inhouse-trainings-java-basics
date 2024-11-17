package com.jh.iht.java.basics.controlflow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Simplify the if statement to check if a number is even or odd.
 * Input: int num = 4
 * Expected Output: "Even"
 */
public class DSimplifyingIfStatementsTest {

    @Test
    public void testCheckEvenOrOdd() {
        DSimplifyingIfStatements sif = new DSimplifyingIfStatements();
        int num = 4;
        String expected = "Even";  // Expected result: "Even"
        Assertions.assertEquals(expected, sif.checkEvenOrOdd(num));
    }
}