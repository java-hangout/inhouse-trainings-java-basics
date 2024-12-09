package org.jh.iht.java.basics.day04;

import java.util.regex.*;

public class RegexProgram01 {

    // Run method to demonstrate Pattern and Matcher
    public static String run(String input) {
        // Define a regular expression pattern to match words starting with "Ja"
        String regex = "Ja\\w*";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        // Create a matcher to find the pattern in the input string
        Matcher matcher = pattern.matcher(input);

        // StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        // Find matches
        while (matcher.find()) {
            result.append("Found match: ").append(matcher.group()).append("\n");
        }

        // Return the result or a message if no match found
        if (result.length() == 0) {
            return "No matches found";
        }

        return result.toString();
    }
}