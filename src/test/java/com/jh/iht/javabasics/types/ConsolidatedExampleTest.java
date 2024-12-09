package com.jh.iht.javabasics.types;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConsolidatedExampleTest {

    // Test 1: Variables, Primitive Types, and Arithmetic Expressions
    @Test
    public void testVariablesAndArithmetic() {
        /*
         * Problem: Given two integers, find their sum.
         * Input: a = 5, b = 3
         * Expected Output: 8
         */
        int sumResult = ConsolidatedExample.sum(5, 3);
        Assertions.assertEquals(8, sumResult); // Expected: 8, Actual: sumResult

        /*
         * Problem: Add two primitive integers.
         * Input: a = 10, b = 5
         * Expected Output: 15
         */
        int addResult = ConsolidatedExample.addPrimitive(10, 5);
        Assertions.assertEquals(15, addResult); // Expected: 15, Actual: addResult

        /*
         * Problem: Calculate the expression a * b + 10.
         * Input: a = 5, b = 4
         * Expected Output: 30.0
         */
        double expressionResult = ConsolidatedExample.calculateExpression(5, 4);
        Assertions.assertEquals(30.0, expressionResult, 0.01); // Expected: 30.0, Actual: expressionResult
    }

    // Test 2: Reference Types and Escape Sequences
    @Test
    public void testReferenceTypesAndEscapeSequences() {
        /*
         * Problem: Concatenate two strings.
         * Input: a = "Hello", b = "World"
         * Expected Output: "HelloWorld"
         */
        String concatResult = ConsolidatedExample.concatenateStrings("Hello", "World");
        Assertions.assertEquals("HelloWorld", concatResult); // Expected: "HelloWorld", Actual: concatResult

        /*
         * Problem: Demonstrate escape sequences in a string.
         * Input: None (hardcoded in the method)
         * Expected Output: "Hello\nWorld!\tTab\\Backslash"
         */
        String expected = "Hello\nWorld!\tTab\tBackslash";
        String actual = ConsolidatedExample.escapeSequences();
        Assertions.assertEquals(expected, actual); // Expected: "Hello\nWorld!\tTab\\Backslash", Actual: escapeResult
    }

    // Test 3: Arrays, Multi-dimensional Arrays, and Constants
    @Test
    public void testArraysAndConstants() {
        /*
         * Problem: Given an array, double each of its values.
         * Input: array = {1, 2, 3}
         * Expected Output: {2, 4, 6}
         */
        int[] arrayResult = ConsolidatedExample.doubleArrayValues(new int[]{1, 2, 3});
        Assertions.assertArrayEquals(new int[]{2, 4, 6}, arrayResult); // Expected: {2, 4, 6}, Actual: arrayResult

        /*
         * Problem: Sum the values in a 2D array.
         * Input: 2D array = {{1, 2}, {3, 4}}
         * Expected Output: 10
         */
        int sum2DResult = ConsolidatedExample.sum2DArray(new int[][]{{1, 2}, {3, 4}});
        Assertions.assertEquals(10, sum2DResult); // Expected: 10, Actual: sum2DResult

        /*
         * Problem: Return the constant value defined in the class.
         * Expected Output: 100
         */
        int constantResult = ConsolidatedExample.getConstantValue();
        Assertions.assertEquals(100, constantResult); // Expected: 100, Actual: constantResult
    }

}
