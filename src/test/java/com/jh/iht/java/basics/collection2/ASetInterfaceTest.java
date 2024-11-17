package com.jh.iht.java.basics.collection2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem Statement:
 * The Set interface ensures that a collection does not contain duplicate elements. 
 * Verifies that duplicate elements are not added to the set.
 * Input: - Set of elements ["Apple", "Banana", "Apple", "Cherry"]
 * Expected Output: - Set size: 3, Contains "Apple": true, Contains "Orange": false
 */
public class ASetInterfaceTest {

    @Test
    public void testSetMethods() {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplicate element
        set.add("Cherry");
        SetInterface setInterface = new SetInterface();
        int fruitSize = setInterface.getUniqueElements(set);

        // Check the size of the set (should not have duplicates)
        Assertions.assertEquals(3, fruitSize);

        // Check if specific items are in the set
        Assertions.assertTrue(set.contains("Apple"));
        Assertions.assertFalse(set.contains("Orange"));
    }
}