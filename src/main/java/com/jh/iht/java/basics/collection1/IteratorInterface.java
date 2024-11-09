package com.jh.iht.java.basics.collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorInterface {
    public List<String> getFruits() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        return fruits;
    }
}