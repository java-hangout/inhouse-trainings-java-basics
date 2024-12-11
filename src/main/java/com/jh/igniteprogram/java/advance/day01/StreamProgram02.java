package com.jh.igniteprogram.java.advance.day01;

import java.util.List;
import java.util.stream.Collectors;

public class StreamProgram02 {

    // Run method demonstrating Filtering, Slicing, and Collecting with Streams
    public static List<Integer> run(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)          // Filter even numbers
                .skip(1)                          // Skip the first element
                .limit(3)                         // Limit the stream to the first 3 elements
                .collect(Collectors.toList());    // Collect the results as a list
    }
}
