package com.jh.igniteprogram.java.advance.day01;

public class GenericsProgram02 {

    // A generic method that works with multiple type parameters and implements Comparable
    public static <T extends Comparable<T>, U extends Comparable<U>> String run(T firstValue, U secondValue) {
        int comparison = firstValue.compareTo((T) secondValue);  // Cast secondValue to T for comparison

        String result = "Comparison of " + firstValue + " and " + secondValue + ": ";
        if (comparison > 0) {
            result += firstValue + " is greater than " + secondValue;
        } else if (comparison < 0) {
            result += firstValue + " is less than " + secondValue;
        } else {
            result += firstValue + " is equal to " + secondValue;
        }
        System.out.println(result);
        return result;
    }

    // Generic class that demonstrates inheritance with generics
    public static class Box<T> {
        private T value;

        public Box(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }

    public static class IntegerBox extends Box<Integer> {
        public IntegerBox(Integer value) {
            super(value);
        }
    }

    public static class StringBox extends Box<String> {
        public StringBox(String value) {
            super(value);
        }
    }
}
