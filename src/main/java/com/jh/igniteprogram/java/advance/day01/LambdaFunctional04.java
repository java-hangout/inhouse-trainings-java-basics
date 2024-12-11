package com.jh.igniteprogram.java.advance.day01;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class LambdaFunctional04 {

    // Run method demonstrating Function, Predicate, BinaryOperator, and UnaryOperator
    public static int run(int input) {
        // Using Function to double the value
        Function<Integer, Integer> doubler = x -> x * 2;
        int doubled = doubler.apply(input);

        // Using Predicate to check if a number is even
        Predicate<Integer> isEven = x -> x % 2 == 0;
        boolean result = isEven.test(doubled);

        // Using BinaryOperator to add two values
        BinaryOperator<Integer> adder = (x, y) -> x + y;
        int added = adder.apply(doubled, 10);

        // Using UnaryOperator to square the value
        UnaryOperator<Integer> squarer = x -> x * x;
        return squarer.apply(added);
    }
}
