package com.jh.iht.java.basics.collection2;

import java.util.*;

public class CollectionComparison {

    public List<String> getList() {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple"); // Duplicates allowed
        return list;
    }

    public Set<String> getSet() {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplicates not allowed
        return set;
    }

    public Map<String, String> getMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Apple", "1");
        map.put("Banana", "2");
        map.put("Apple", "3"); // Duplicate keys not allowed
        return map;
    }
}