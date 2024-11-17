package com.jh.iht.java.basics.controlflow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Compare two integers using comparison operators.
 * Input:
 * - int a = 5
 * - int b = 3
 * Expected Output:
 * - true since 5 > 3
 */
public class AComparisonOperatorsTest {

    @Test
    public void testCompareNumbers() {
        AComparisonOperators co = new AComparisonOperators();
        int a = 5, b = 3;
        boolean expected = true;  // Expected: 5 > 3
        Assertions.assertEquals(expected, co.compareNumbers(a, b));
    }
}