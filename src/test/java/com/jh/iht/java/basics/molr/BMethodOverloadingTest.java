package com.jh.iht.java.basics.molr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
Problem Statement: Demonstrate method overloading by creating a Calculator class with multiple add methods
that accept different numbers or types of arguments.
Input:
    - add(2, 3)
    - add(2.5, 3.5)
    - add(1, 2, 3)
Expected Output:
    - add(2, 3) should return 5
    - add(2.5, 3.5) should return 6.0
    - add(1, 2, 3) should return 6
*/
public class BMethodOverloadingTest {

    @Test
    public void testAddTwoIntegers() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testAddTwoDoubles() {
        Calculator calculator = new Calculator();
        double result = calculator.add(2.5, 3.5);
        Assertions.assertEquals(6.0, result, 0.001);
    }

    @Test
    public void testAddThreeIntegers() {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2, 3);
        Assertions.assertEquals(6, result);
    }
}