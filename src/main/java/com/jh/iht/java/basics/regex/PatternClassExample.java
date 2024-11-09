package com.jh.iht.java.basics.regex;

import java.util.regex.*;

public class PatternClassExample {
    public boolean checkPatternMatch(String text, String regex) {
        // Compile the regular expression
        Pattern pattern = Pattern.compile(regex);
        // Create a matcher object to match the regex with input text
        Matcher matcher = pattern.matcher(text);
        // Return whether the text matches the pattern
        return matcher.matches();
    }
}