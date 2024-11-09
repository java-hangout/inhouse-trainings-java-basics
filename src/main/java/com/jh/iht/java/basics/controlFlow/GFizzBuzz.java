package com.jh.iht.java.basics.controlFlow;

public class GFizzBuzz {
    // Method to print "Fizz", "Buzz" or "FizzBuzz" based on divisibility
    public String fizzBuzz(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(num);
        }
    }
}