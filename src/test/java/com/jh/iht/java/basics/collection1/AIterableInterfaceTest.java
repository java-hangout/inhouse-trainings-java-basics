package com.jh.iht.java.basics.collection1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Problem Statement:
 * The Iterable interface allows collections to be iterated using the enhanced for loop. 
 * This test checks if the collection of programming languages is correctly iterated.
 * 
 * Input:
 * - List of programming languages ["Java", "Python", "C++"]
 * 
 * Expected Output:
 * - "Java", "Python", "C++" printed in separate lines.
 */
public class AIterableInterfaceTest {

    @Test
    public void testIterable() {
        IterableInterface iterableInterface = new IterableInterface();
        List<String> languages = iterableInterface.getProgrammingLanguages();

        String expectedOutput = "Java\nPython\nC++\n";
        StringBuilder actualOutput = new StringBuilder();

        // Iterate using the enhanced for loop (which uses the Iterable interface)
        for (String language : languages) {
            actualOutput.append(language).append("\n");
        }

        Assertions.assertEquals(expectedOutput, actualOutput.toString());
    }
}