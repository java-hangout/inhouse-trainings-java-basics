package com.jh.iht.java.basics.collection2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

/**
 * Problem Statement:
 * The Set interface ensures that a collection does not contain duplicate elements. 
 * This test verifies that duplicate elements are not added to the set.
 * 
 * Input:
 * - Set of elements ["Apple", "Banana", "Apple", "Cherry"]
 * 
 * Expected Output:
 * - Set size: 3, Contains "Apple": true, Contains "Orange": false
 */
public class ASetInterfaceTest {

    @Test
    public void testSetMethods() {
        SetInterface setInterface = new SetInterface();
        Set<String> fruits = setInterface.getUniqueElements();

        // Check the size of the set (should not have duplicates)
        Assertions.assertEquals(3, fruits.size());

        // Check if specific items are in the set
        Assertions.assertTrue(fruits.contains("Apple"));
        Assertions.assertFalse(fruits.contains("Orange"));
    }
}