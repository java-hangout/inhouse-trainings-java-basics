package com.jh.iht.java.basics.regex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem Statement:
 * The Pattern class is used to define regular expressions. 
 * Checks if a given text matches a pattern using Pattern and Matcher classes.
 * Input:
 * - Text: "hello123"
 * - Regex: "^[a-z]+\\d+$"
 * Expected Output:
 * - true (text matches the pattern)
 */
public class APatternClassExampleTest {

    @Test
    public void testPatternMatch() {
        PatternClassExample patternClassExample = new PatternClassExample();
        boolean result = patternClassExample.checkPatternMatch("hello123", "^[a-z]+\\d+$");
        Assertions.assertTrue(result);
    }
    @Test
    public void testPatternMatch_Negative() {
        PatternClassExample patternClassExample = new PatternClassExample();
        boolean result = patternClassExample.checkPatternMatch("hello1231qw", "^[a-z]+\\d+$");
        Assertions.assertFalse(result);
    }
}