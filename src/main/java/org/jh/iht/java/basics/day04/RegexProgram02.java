package org.jh.iht.java.basics.day04;

import java.util.regex.*;

public class RegexProgram02 {

    // Run method to demonstrate PatternSyntaxException handling and MatchResult
    public static String run(String input) {
        // Define a regular expression pattern with invalid syntax
        String regex = "([A-Z";

        try {
            // Compile the pattern, which will throw a PatternSyntaxException
            Pattern pattern = Pattern.compile(regex);

            // Create a matcher
            Matcher matcher = pattern.matcher(input);

            // Using MatchResult interface to return match details
            MatchResult result = matcher.toMatchResult();
            return "First match group: " + result.group(0);

        } catch (PatternSyntaxException e) {
            // Return the exception message
            return "Pattern Syntax Error: " + e.getDescription();
        }
    }
}