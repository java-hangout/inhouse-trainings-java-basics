package com.jh.iht.java.basics.string;

public class StringBufferBuilderExample {

    // Method to demonstrate StringBuffer usage
    public String useStringBuffer() {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        sb.insert(5, " Java");
        return sb.toString();
    }

    // Method to demonstrate StringBuilder usage
    public String useStringBuilder() {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, " Java");
        return sb.toString();
    }
}
