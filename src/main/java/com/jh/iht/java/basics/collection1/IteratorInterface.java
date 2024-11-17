package com.jh.iht.java.basics.collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorInterface {
    public StringBuilder getFruits(List<String> fruits) {
        StringBuilder actualOutput = new StringBuilder();
        // Using Iterator to iterate through the list
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            actualOutput.append(iterator.next()).append("\n");
        }
        return actualOutput;
    }
}