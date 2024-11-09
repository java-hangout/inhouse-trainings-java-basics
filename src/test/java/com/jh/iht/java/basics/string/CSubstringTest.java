package com.jh.iht.java.basics.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
Problem Statement: Demonstrate the use of substring() to extract substrings from a string.
Input:
    - String str initialized to "Hello, World!".
    - Extract substrings using substring() with different indices.

Expected Output:
    - Substring starting from index 7 should be "World!".
    - Substring from index 0 to 5 should be "Hello".
*/

public class CSubstringTest {

    @Test
    void testSubstring() {
        SubstringExample example = new SubstringExample();
        
        // Input string
        String str = "Hello, World!";

        // Extract substrings
        String result = example.extractSubstrings(str);
        
        // Validate the extracted substrings
        String[] substrings = result.split(";");
        assertEquals("World!", substrings[0]);  // Extracted substring from index 7
        assertEquals("Hello", substrings[1]);  // Extracted substring from index 0 to 5
    }
}
