package com.jh.iht.javabasics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TypesTopicTests {

    // 1. Test: Summing two variables (Arithmetic Operations)
    /**
     * Problem: Implement a static method to sum two integer variables.
     * Input: int a = 7, int b = 3
     * Expected Output: The sum of the variables is 7 + 3 = 10.
     */
    @Test
    public void testSumVariables() {
        int a = 7;
        int b = 3;
        int expected = 10;  // Expected sum: 7 + 3 = 10
        Assertions.assertEquals(expected, TypesTopic.sumVariables(a, b));
    }

    // 2. Test: Concatenate two strings and convert to uppercase (String Operations)
    /**
     * Problem: Implement a static method to concatenate two strings and return the concatenated string in uppercase.
     * Input: String a = "Hello", String b = "World"
     * Expected Output: The concatenated string in uppercase is "HELLOWORLD".
     */
    @Test
    public void testConcatenateAndUppercase() {
        String a = "Hello";
        String b = "World";
        String expected = "HELLOWORLD";  // Expected result: "HELLOWORLD"
        Assertions.assertEquals(expected, TypesTopic.concatenate(a, b));
    }

    // 3. Test: Doubling values in an array (Array Operations)
    /**
     * Problem: Implement a static method to double the values of each element in an array.
     * Input: int[] array = {1, 2, 3}
     * Expected Output: The modified array should be {2, 4, 6}.
     */
    @Test
    public void testDoubleArrayValues() {
        int[] inputArray = {1, 2, 3};
        int[] expectedArray = {2, 4, 6};  // Expected result: {2, 4, 6}
        Assertions.assertArrayEquals(expectedArray, TypesTopic.doubleArrayValues(inputArray));
    }

    // 4. Test: Return constant value (Constants and Static Final Variables)
    /**
     * Problem: Implement a static method to return a constant value.
     * Input: CONSTANT_VALUE = 100
     * Expected Output: The method should return 100.
     */
    @Test
    public void testConstantValue() {
        int expected = 100;  // Expected constant value: 100
        Assertions.assertEquals(expected, TypesTopic.getConstantValue());
    }
}
