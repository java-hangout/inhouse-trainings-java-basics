package com.jh.iht.java.basics.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Implement a method to add two integers and return the result.
 * Input: int a = 5, int b =10
 * Expected Output: The sum of the integers is 5 + 10 = 15.
 */
public class BBPrimitiveTypesTest {

    @Test
    public void testAddIntegers() {
        BPrimitiveTypes pt = new BPrimitiveTypes();
        int a = 5;
        int b = 10;
        int expected = 15;  // Expected result: 5 + 10 = 15
        Assertions.assertEquals(expected, pt.addIntegers(a, b));
    }
}