package com.jh.iht.java.basics.co;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Demonstrate method overloading with different parameter types.
 * Input: - Integers: 2 and 3, Doubles: 2.5 and 3.5, Integers: 1, 2, 3
 * Expected Output:
 * - Sum of integers = 5
 * - Sum of doubles = 6.0
 * - Sum of three integers = 6
 */
public class HMethodOverloadingTest {

    @Test
    public void testAddIntegers() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testAddDoubles() {
        Calculator calculator = new Calculator();
        double result = calculator.add(2.5, 3.5);
        Assertions.assertEquals(6.0, result, 0.01);
    }

    @Test
    public void testAddThreeIntegers() {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2, 3);
        Assertions.assertEquals(6, result);
    }
}