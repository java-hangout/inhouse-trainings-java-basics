package com.jh.iht.java.basics.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
Problem Statement: Demonstrate the usage of String methods like trim(), toUpperCase(), replace(), and substring().
Input:
    - String "  hello world  ".
Expected Output:
    - The string should be modified by:
        - Removing leading and trailing spaces.
        - Converting to uppercase.
        - Replacing "HELLO" with "Hi".
        - Returning the first two characters of the resulting string.
*/

public class DStringMethodsTest {

    @Test
    void testStringMethods() {
        StringMethodsExample example = new StringMethodsExample();
        
        // Input string
        String input = "  hello world  ";
        
        // Call method to apply string transformations
        String result = example.stringMethodsExample(input);
        
        // Validate the result after applying all transformations
        assertEquals("HI", result);  // The expected result is "HI" (trimmed, uppercase, replaced, first two characters)
    }
}
