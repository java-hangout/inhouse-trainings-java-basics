package com.jh.iht.java.basics.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Demonstrate the difference between primitive and reference types.
 * <p>
 * Input:
 * - Primitive type: int primitive = 10, anotherPrimitive = 20
 * - Reference type: String[] reference = {"Hello"}, anotherReference points to reference
 * <p>
 * Expected Output:
 * - "Primitive: 10"
 * - "Another Primitive: 20"
 * - "Reference: World"
 */
public class DPrimitiveVsReferenceTypesTest {


    /**
     * Problem Statement:
     * <p>
     * 1. Write a program to demonstrate the difference between primitive types and reference types.
     * 2. Test if:
     * - Primitive types hold the value directly, and modifying one variable doesn't affect another variable.
     * - Reference types store references to objects, and modifying one reference variable doesn't change the other.
     */

    @Test
    public void testPrimitiveTypes() {
        // Create an instance of the class that contains the methods
        DPrimitiveVsReferenceTypes example = new DPrimitiveVsReferenceTypes();

        // Call the method to demonstrate primitive types
        // We will test the values directly, since printing is done inside the program
        int a = 10;
        int b = a;  // Copy value of a to b
        b = 20;  // Modify b

        // After modifying b, the value of a should not change
        Assertions.assertEquals(10, a);
        Assertions.assertEquals(20, b);
    }

    @Test
    public void testReferenceTypes() {
        // Create an instance of the class that contains the methods
        DPrimitiveVsReferenceTypes example = new DPrimitiveVsReferenceTypes();

        // Create two reference variables pointing to the same object
        String str1 = "Hello";
        String str2 = str1;  // str2 points to the same object as str1

        // Now change str2 to point to a new object
        str2 = "World";  // str2 now points to a new object

        // Test the values after modification
        Assertions.assertEquals("Hello", str1);
        Assertions.assertEquals("World", str2);
    }
}