package com.jh.iht.java.basics.string;

public class SubstringExample {

    // Method to demonstrate substring extraction
    public String extractSubstrings(String str) {
        String subStr1 = str.substring(7);  // Extract from index 7 to end
        String subStr2 = str.substring(0, 5);  // Extract from index 0 to 5
        return subStr1 + ";" + subStr2;  // return both substrings
    }
}
