package com.jh.igniteprogram.java.advance.day01;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamProgram03 {

    // Run method demonstrating Simple Reducers, Grouping, and Partitioning
    public static Map<Boolean, List<Integer>> run(List<Integer> numbers) {
        return numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));  // Partition by even/odd numbers
    }
}
