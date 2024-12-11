package com.jh.igniteprogram.java.basics.day03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections1Program02 {

    // Run method to demonstrate Iterable interface
    public static String run() {
        List<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");

        // Using Iterable to iterate over the list
        StringBuilder result = new StringBuilder("Items: ");
        for (String item : items) {
            result.append(item).append(" ");
        }
        return result.toString().trim();
    }
}