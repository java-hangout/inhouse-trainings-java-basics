package com.jh.iht.java.basics.collection1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Problem Statement:
 * The List interface allows ordered collections with duplicate elements. 
 * Checks if elements can be accessed using their index positions.
 * Expected Output:
 * - List of fruits ["Apple", "Banana", "Cherry"]
 * - Check "Apple" for index 0, "Banana" for index 1
 */
public class DListInterfaceTest {

    @Test
    public void testListMethods() {
        ListInterface listInterface = new ListInterface();
        List<String> fruits = listInterface.getFruits();
        // Check element at specific index
        Assertions.assertEquals("Apple", fruits.get(0));
        Assertions.assertEquals("Banana", fruits.get(1));
    }
}