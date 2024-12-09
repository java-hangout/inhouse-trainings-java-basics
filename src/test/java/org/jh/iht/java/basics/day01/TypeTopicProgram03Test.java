package org.jh.iht.java.basics.day01;

import org.jh.iht.java.basics.day01.TypeTopicProgram03;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TypeTopicProgram03Test {
    
    /*
     * Problem Statement:
     * Verify that the method correctly calculates the sum of the squares of integers
     * and computes the square root of the sum correctly.
     *
     * Input: 
     * An array of integers: {0, 1, 2, 3, 4}
     * 
     * Expected Output:
     * "Sum of array elements: 30\nSquare root of sum: 5.477226"
     */
    
    @Test
    public void testRun() {
        // Prepare the input array
        int[] inputArray = {0, 1, 2, 3, 4};
        
        // Run the method with the input array and capture the result
        String result = TypeTopicProgram03.run(inputArray);
        
        // Assert the expected result
        String expected = "Sum of square of array elements: 30\nSquare root of sum: 5.477226";
        System.out.println("expected : " + expected);
        assertEquals(expected, result);
    }
}
