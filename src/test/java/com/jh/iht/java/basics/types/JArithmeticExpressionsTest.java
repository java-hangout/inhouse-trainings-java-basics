package com.jh.iht.java.basics.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Calculate the arithmetic expression (a + b) * (c - d).
 * Input:
 * - int a = 5
 * - int b = 3
 * - int c = 8
 * - int d = 2
 * Expected Output:
 * - The result of (5 + 3) * (8 - 2) = 8 * 6 = 48
 */
public class JArithmeticExpressionsTest {

    @Test
    public void testCalculateExpression() {
        JArithmeticExpressions ae = new JArithmeticExpressions();
        int a = 5, b = 3, c = 8, d = 2;
        int expected = 48;  // Expected result: (5 + 3) * (8 - 2) = 8 * 6 = 48
        Assertions.assertEquals(expected, ae.calculateExpression(a, b, c, d));
    }
}