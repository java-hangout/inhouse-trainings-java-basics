package com.jh.iht.java.basics.collection1;

import java.util.ArrayList;
import java.util.List;

public class IterableInterface {
    public StringBuilder getProgrammingLanguages(List<String> languages) {
        StringBuilder actualOutput = new StringBuilder();
        // Iterate using the enhanced for loop (which uses the Iterable interface)
        for (String language : languages) {
            actualOutput.append(language).append("\n");
        }
        return actualOutput;
    }
}