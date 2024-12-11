package com.jh.igniteprogram.java.advance.day01;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaFunctional03 {

    // Run method demonstrating Consumer and Supplier functional interfaces
    public static String run(String input) {
        // Using Consumer to print a value
        Consumer<String> printer = value -> System.out.println("Value: " + value);
        printer.accept(input);

        // Using Supplier to provide a value
        Supplier<String> supplier = () -> "Hello from Supplier!";
        return supplier.get();
    }
}
