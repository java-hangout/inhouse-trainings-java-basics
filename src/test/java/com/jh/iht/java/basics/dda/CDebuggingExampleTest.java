package com.jh.iht.java.basics.dda;

/**
 * Problem: Debugging issues in methods such as logical errors and incorrect computations.
 * 
 * Input:
 * - Method to add numbers (bug in addition).
 * - Method to find max value (bug in handling empty array).
 * 
 * Expected Output:
 * - The addNumbers method should return incorrect results due to multiplication instead of addition.
 * - The findMax method should throw an exception for an empty array.
 */
/*
public class CDebuggingExampleTest {

    @Test
    public void testAddNumbers() {
        DebuggingExample debug = new DebuggingExample();
        int result = debug.addNumbers(5, 3);
        int expected = 8;  // Bug: The method returns 15 (5 * 3) instead of 8 (5 + 3)
        assertNotEquals(expected, result);  // This will fail due to the bug
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testFindMaxWithEmptyArray() {
        DebuggingExample debug = new DebuggingExample();
        int[] numbers = {}; // Empty array
        debug.findMax(numbers);  // This should throw an exception
    }
}*/
