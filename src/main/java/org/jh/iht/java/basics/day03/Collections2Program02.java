package org.jh.iht.java.basics.day03;

import java.util.HashMap;
import java.util.Map;

public class Collections2Program02 {

    // Run method to demonstrate Map interface and HashMap (which implements Map)
    public static String run() {
        Map<String, Integer> fruitQuantities = new HashMap<>();
        fruitQuantities.put("Apple", 5);
        fruitQuantities.put("Banana", 3);
        fruitQuantities.put("Cherry", 7);
        
        // Retrieving the value associated with a specific key
        int appleCount = fruitQuantities.get("Apple");
        
        return "Apple count: " + appleCount + ", Map contains: " + fruitQuantities;
    }
}