package com.jh.iht.javabasics.controlflow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Comparison Operators and Logical Operators.
 */
public class ComparisonLogicalOperatorsTest {

    /**
     * Test Case: Test compareNumbers method.
     * Problem: Compare two numbers and check if they are equal.
     * Input: a = 5, b = 5
     * Expected Output: true
     */
    @Test
    public void testCompareNumbers() {
        boolean result = ComparisonLogicalOperators.compareNumbers(5, 5);
        assertEquals(true, result);
    }

    /**
     * Test Case: Test areBothPositive method.
     * Problem: Check if both numbers are positive.
     * Input: a = 4, b = 2
     * Expected Output: true
     */
    @Test
    public void testAreBothPositive() {
        boolean result = ComparisonLogicalOperators.areBothPositive(4, 2);
        assertEquals(true, result);
    }
}
