package com.jh.iht.java.basics.collection1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        IteratorInterface iteratorInterface = new IteratorInterface();
        List<String> fruits = iteratorInterface.getFruits();

        String expectedOutput = "Apple\nBanana\nCherry\n";
        StringBuilder actualOutput = new StringBuilder();

        // Using Iterator to iterate through the list
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            actualOutput.append(iterator.next()).append("\n");
        }

        Assertions.assertEquals(expectedOutput, actualOutput.toString());
    }
}