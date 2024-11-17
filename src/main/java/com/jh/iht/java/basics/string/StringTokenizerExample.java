package com.jh.iht.java.basics.string;

import java.util.StringTokenizer;

public class StringTokenizerExample {

    // Method to demonstrate StringTokenizer usage
    public String tokenizeString(String str) {
        StringTokenizer tokenizer = new StringTokenizer(str,",");
        StringBuilder tokens = new StringBuilder();
        while (tokenizer.hasMoreTokens()) {
            tokens.append(tokenizer.nextToken()).append(" ");
        }
        return tokens.toString().trim();  // Return space-separated tokens
    }
}
