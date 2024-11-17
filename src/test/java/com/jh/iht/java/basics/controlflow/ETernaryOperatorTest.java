package com.jh.iht.java.basics.controlflow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Use ternary operator to check if a number is positive or negative.
 * Input: - int num = -3
 * Expected Output: - "Negative"
 */
public class ETernaryOperatorTest {

    @Test
    public void testCheckPositiveNegative() {
        ETernaryOperator to = new ETernaryOperator();
        int num = -3;
        String expected = "Negative";  // Expected result: "Negative"
        Assertions.assertEquals(expected, to.checkPositiveNegative(num));
    }
    @Test
    public void testCheckPositiveNegative1() {
        ETernaryOperator to = new ETernaryOperator();
        int num = 4;
        String expected = "Positive";  // Expected result: "Negative"
        Assertions.assertEquals(expected, to.checkPositiveNegative(num));
    }
}