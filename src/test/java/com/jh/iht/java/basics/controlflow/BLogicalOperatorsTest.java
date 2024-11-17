package com.jh.iht.java.basics.controlflow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Check logical operators (AND, OR).
 * Input:
 * - int a = 5
 * - int b = 3
 * Expected Output:
 * - true since 5 > 3 and 3 > 0
 */
public class BLogicalOperatorsTest {

    @Test
    public void testCheckLogicalOperators() {
        BLogicalOperators lo = new BLogicalOperators();
        int a = 5, b = 3;
        boolean expected = true;  // Expected: (5 > 3) && (3 > 0)
        Assertions.assertEquals(expected, lo.checkLogicalOperators(a, b));
    }
}