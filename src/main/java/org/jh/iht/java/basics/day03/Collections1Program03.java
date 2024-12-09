package org.jh.iht.java.basics.day03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections1Program03 {

    // Run method to demonstrate Comparator interface
    public static String run() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Sorting the list using a custom Comparator
        Collections.sort(fruits, new Comparator<String>() {
            @Override
            public int compare(String fruit1, String fruit2) {
                return fruit1.length() - fruit2.length(); // Compare by string length
            }
        });

        return "Sorted fruits by length: " + fruits;
    }
}