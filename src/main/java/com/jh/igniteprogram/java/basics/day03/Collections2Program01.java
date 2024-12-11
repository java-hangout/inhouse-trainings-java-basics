package com.jh.igniteprogram.java.basics.day03;

import java.util.HashSet;
import java.util.Set;

public class Collections2Program01 {

    // Run method to demonstrate Set interface and HashSet (which implements Set)
    public static String run() {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple");  // Duplicate item, should not be added
        
        return "Set contains: " + fruits;
    }
}