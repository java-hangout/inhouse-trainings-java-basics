package com.jh.iht.java.basics.collection2;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
    public Set<String> getUniqueElements() {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplicate element
        set.add("Cherry");
        return set;
    }
}