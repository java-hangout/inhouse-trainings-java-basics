package org.jh.iht.java.basics.day03;

import java.util.ArrayList;
import java.util.List;

public class Collections1Program01 {

    // Run method to demonstrate an overview of Collections
    public static String run() {
        List<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");
        
        return "Items in collection: " + items;
    }
}