package com.jh.iht.java.basics.collection2;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public Map<String, String> getCapitalCities() {
        Map<String, String> capitals = new HashMap<>();
        capitals.put("US", "Washington, D.C.");
        capitals.put("IN", "New Delhi");
        capitals.put("UK", "London");
        return capitals;
    }
}