package com.jh.iht.java.basics.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Use methods from the Math class to compute mathematical operations.
 * Input:
 * - double a = 4
 * - double b = 2
 * Expected Output:
 * - Math.pow(4, 2) = 16
 * - Math.sqrt(4) = 2
 * - The result is round(16 + 2) = round(18) = 18
 */
public class MMathClassTest {

    @Test
    public void testComputeMathOperations() {
        MMathClass math = new MMathClass();
        double a = 4, b = 2;
        double expected = 18;  // Expected result: Math.pow(4, 2) + Math.sqrt(4) = 18
        Assertions.assertEquals(expected, math.computeMathOperations(a, b));
    }
}