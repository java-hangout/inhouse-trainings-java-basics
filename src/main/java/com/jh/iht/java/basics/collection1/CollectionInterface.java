package com.jh.iht.java.basics.collection1;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterface {
    public Collection<String> getItems() {
        Collection<String> collection = new ArrayList<>();
        collection.add("Apple");
        collection.add("Banana");
        collection.add("Cherry");
        return collection;
    }
}