package com.jh.iht.java.basics.string;

public class StringMethodsExample {

    // Method to demonstrate basic String methods
    public String stringMethodsExample(String input) {
        String str = input.trim();                // Removes leading and trailing whitespace
        str = str.toUpperCase();                   // Converts to uppercase
        str = str.replace("HELLO", "Hi");          // Replaces "HELLO" with "Hi"
        return str.substring(0, 2);                // Extract first two characters
    }
}
