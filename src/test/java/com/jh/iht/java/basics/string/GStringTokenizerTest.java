package com.jh.iht.java.basics.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
Problem Statement: Demonstrate the usage of StringTokenizer to split a string into tokens.
Input:
    - String "Hello World from Java".
Expected Output:
    - The tokens should be "Hello World from Java".
*/

public class GStringTokenizerTest {

    @Test
    void testStringTokenizer() {
        StringTokenizerExample example = new StringTokenizerExample();
        
        // Input string
        String input = "Hello World from Java";
        
        // Call method to tokenize the string
        String result = example.tokenizeString(input);
        
        // Validate the result
        assertEquals("Hello World from Java", result);  // Tokens should be space-separated
    }
}
