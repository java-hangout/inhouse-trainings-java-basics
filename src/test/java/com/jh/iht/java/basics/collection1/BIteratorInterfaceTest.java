package com.jh.iht.java.basics.collection1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Problem Statement:
 * The Iterator interface provides a standard way to iterate over collections. 
 * This test checks if the Iterator correctly iterates over a list of fruits.
 * 
 * Input:
 * - List of fruits ["Apple", "Banana", "Cherry"]
 * 
 * Expected Output:
 * - "Apple", "Banana", "Cherry" printed in separate lines.
 */
public class BIteratorInterfaceTest {

    @Test
    public void testIterator() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        IteratorInterface iteratorInterface = new IteratorInterface();
        StringBuilder actualOutput = iteratorInterface.getFruits(fruits);
        String expectedOutput = "Apple\nBanana\nCherry\n";
        Assertions.assertEquals(expectedOutput, actualOutput.toString());
    }
}