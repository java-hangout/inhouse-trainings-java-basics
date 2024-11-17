package com.jh.iht.java.basics.controlflow;

import org.junit.jupiter.api.Assertions;

/**
 * Problem: Print "Fizz" if divisible by 3, "Buzz" if divisible by 5, 
 * and "FizzBuzz" if divisible by both.
 * Input:
 * - int num = 15
 * Expected Output:
 * - "FizzBuzz"
 */
public class GFizzBuzzTest {

    @org.junit.jupiter.api.Test
    public void testFizzBuzz() {
        GFizzBuzz fb = new GFizzBuzz();
        int num = 15;
        String expected = "FizzBuzz";  // Expected result: "FizzBuzz"
        Assertions.assertEquals(expected, fb.fizzBuzz(num));
    }
}