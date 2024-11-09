package com.jh.iht.java.basics.types;

public class RKeywordsExample {
    // Demonstrating the use of 'public', 'private', 'static', and 'final' keywords

    public static final int MAX_VALUE = 100;

    private int value;

    public RKeywordsExample(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static int getMaxValue() {
        return MAX_VALUE;
    }
}