package com.jh.iht.java.basics.regex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem Statement:
 * The Matcher class is used to perform regular expression matching on an input string.
 * This test checks if a given pattern is found in the input text.
 * Input:
 * - Text: "Hello world"
 * - Regex: "world"
 * Expected Output:
 * - true (the pattern is found in the text)
 */
public class BMatcherClassExampleTest {

    @Test
    public void testContainsPattern() {
        MatcherClassExample matcherClassExample = new MatcherClassExample();
        boolean result = matcherClassExample.containsPattern("Hello world", "world");
        Assertions.assertTrue(result);
    }
}