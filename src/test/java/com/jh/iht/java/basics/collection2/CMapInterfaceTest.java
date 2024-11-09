package com.jh.iht.java.basics.collection2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

/**
 * Problem Statement:
 * The Map interface allows storing key-value pairs where each key is unique.
 * This test verifies that the capitals are correctly mapped to their respective countries.
 * 
 * Input:
 * - Map of country codes to capital cities {"US" -> "Washington, D.C.", "IN" -> "New Delhi", "UK" -> "London"}
 * 
 * Expected Output:
 * - Capital of US: "Washington, D.C.", Contains "India": false
 */
public class CMapInterfaceTest {

    @Test
    public void testMapMethods() {
        MapInterface mapInterface = new MapInterface();
        Map<String, String> capitals = mapInterface.getCapitalCities();

        // Check the capital for specific countries
        Assertions.assertEquals("Washington, D.C.", capitals.get("US"));
        Assertions.assertEquals("New Delhi", capitals.get("IN"));

        // Check if "India" is in the map as a key
        Assertions.assertFalse(capitals.containsKey("India"));
    }
}