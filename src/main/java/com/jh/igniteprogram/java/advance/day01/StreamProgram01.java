package com.jh.igniteprogram.java.advance.day01;

import java.util.List;
import java.util.stream.Collectors;

public class StreamProgram01 {

    // Run method demonstrating Stream creation, Mapping, Filtering, and Sorting
    public static List<Integer> run(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n > 0)          // Filter positive numbers
                .map(n -> n * 2)             // Map each number to its double
                .sorted()                    // Sort numbers in ascending order
                .collect(Collectors.toList());  // Collect the results as a list
    }
}
