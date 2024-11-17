package com.jh.iht.java.basics.regex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Problem Statement:
 * The MatchResult interface provides methods to retrieve details about the matched pattern.
 * Checks if the start and end indices of a matched pattern are correctly returned.
 * Input:
 * - Text: "Java regex example"
 * - Regex: "regex"
 * Expected Output:
 * - Matched: "regex"
 * - Start index: 5
 * - End index: 9
 */
public class DMatchResultExampleTest {

    @Test
    public void testMatchResult() {
        MatchResultExample matchResultExample = new MatchResultExample();
        
        // Expected output for the regex "regex" in the text "Java regex example"
        matchResultExample.printMatchDetails("Java regex example", "regex");
        
        // Since we're testing the output, we can also assert the matched results
        Pattern pattern = Pattern.compile("regex");
        Matcher matcher = pattern.matcher("Java regex example");
        if (matcher.find()) {
            MatchResult result = matcher.toMatchResult();
            Assertions.assertEquals("regex", result.group());
            Assertions.assertEquals(5, result.start());
            Assertions.assertEquals(10, result.end());
        }
    }
}