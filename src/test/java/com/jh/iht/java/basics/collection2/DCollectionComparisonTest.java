package com.jh.iht.java.basics.collection2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Problem Statement:
 * This test compares the behaviors of List, Set, and Map in Java.
 * A List allows duplicates, a Set disallows duplicates, and a Map allows key-value pairs with unique keys.
 * Input:
 * - List: ["Apple", "Banana", "Apple"]
 * - Set: ["Apple", "Banana", "Apple"]
 * - Map: {"Apple" -> "1", "Banana" -> "2", "Apple" -> "3"}
 * Expected Output:
 * - List size: 3, Set size: 2, Map size: 2
 */
public class DCollectionComparisonTest {

    @Test
    public void testCollectionComparison() {
        CollectionComparison collectionComparison = new CollectionComparison();

        // Test List
        List<String> list = collectionComparison.getList();
        Assertions.assertEquals(3, list.size()); // Duplicates are allowed

        // Test Set
        Set<String> set = collectionComparison.getSet();
        Assertions.assertEquals(2, set.size()); // Duplicates are not allowed

        // Test Map
        Map<String, String> map = collectionComparison.getMap();
        Assertions.assertEquals(2, map.size()); // Keys are unique, values can change
    }
}