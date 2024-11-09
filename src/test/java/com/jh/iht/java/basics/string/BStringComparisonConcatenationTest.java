package com.jh.iht.java.basics.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
Problem Statement: Demonstrate string comparison and concatenation.
Input:
    - Strings str1, str2, and str3 initialized to "Java", "Java", and a new String("Java").
    - Perform comparison using == and equals().
    - Concatenate strings using + and concat().

Expected Output:
    - str1 == str2 should return true.
    - str1.equals(str3) should return true.
    - str1 == str3 should return false.
    - Concatenation using + and concat() should produce "Java Programming".
*/

public class BStringComparisonConcatenationTest {

    @Test
    void testStringComparison() {
        StringComparisonConcatenation example = new StringComparisonConcatenation();

        // Input strings for comparison
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");

        // Compare the strings
        String result = example.compareStrings(str1, str2, str3);
        
        // Validate the comparison results
        String[] comparisons = result.split(";");
        assertTrue(Boolean.parseBoolean(comparisons[0]));  // str1 == str2 should be true
        assertTrue(Boolean.parseBoolean(comparisons[1]));  // str1.equals(str3) should be true
        assertFalse(Boolean.parseBoolean(comparisons[2]));  // str1 == str3 should be false
    }

    @Test
    void testStringConcatenation() {
        StringComparisonConcatenation example = new StringComparisonConcatenation();

        // Input for concatenation
        String str1 = "Java";
        String additionalText = " Programming";

        // Concatenate the strings
        String result = example.concatenateStrings(str1, additionalText);
        
        // Validate the concatenated results
        String[] concatenated = result.split(";");
        assertEquals("Java Programming", concatenated[0]);  // Concatenation using + 
        assertEquals("Java Programming", concatenated[1]);  // Concatenation using concat()
    }
}
