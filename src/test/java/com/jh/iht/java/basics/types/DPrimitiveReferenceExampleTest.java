package com.jh.iht.java.basics.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem Statement:
 * 1. Write a program to demonstrate the difference between primitive types and reference types.
 * 2. Test if:
 * - Primitive types hold the value directly, and modifying one variable doesn't affect another variable.
 * - Reference types store references to objects, and modifying one reference variable doesn't change the other.
 */
public class DPrimitiveReferenceExampleTest {

    // Test for primitive type behavior
    @Test
    public void testPrimitiveTypes() {
        // Create an instance of the class that contains the methods
        DPrimitiveReferenceExample example = new DPrimitiveReferenceExample();

        // Input values
        int a = 10;
        int b = 15;

        // Call the method and capture the result
        int result = example.demonstratePrimitiveTypes(a, b);

        // Assert that the expected result is 20 (since b is modified to 20 inside the method)
        Assertions.assertEquals(20, result);
    }

    // Test for reference type behavior
    @Test
    public void testReferenceTypes() {
        // Create an instance of the class that contains the methods
        DPrimitiveReferenceExample example = new DPrimitiveReferenceExample();

        // Input values
        String str1 = "Hello";
        String str2 = "Hello";

        // Call the method and capture the result
        String result = example.demonstrateReferenceTypes(str1, str2);

        // Assert that the modified str2 should be "World"
        Assertions.assertEquals("World", result);
    }
}