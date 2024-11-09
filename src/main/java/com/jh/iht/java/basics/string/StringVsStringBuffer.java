package com.jh.iht.java.basics.string;

public class StringVsStringBuffer {

    // Method to demonstrate String vs StringBuffer performance
    public String demonstrateStringVsStringBuffer() {
        String str = "Hello";
        StringBuffer sb = new StringBuffer("Hello");

        // Modify String (creates new object)
        str = str.concat(" World");

        // Modify StringBuffer (modifies in-place)
        sb.append(" World");

        return str + ";" + sb.toString();  // return both results
    }
}
