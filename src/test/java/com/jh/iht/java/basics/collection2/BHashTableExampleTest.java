package com.jh.iht.java.basics.collection2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Hashtable;

/**
 * Problem Statement:
 * A HashTable allows storing key-value pairs, providing quick access to values by keys.
 * Checks if the HashTable can store and retrieve values correctly.
 * Input:
 * - Country codes map: {"US" -> "1", "IN" -> "91", "DE" -> "49"}
 * Expected Output:
 * - Code for US: "1", Code for IN: "91", Contains "UK": false
 */
public class BHashTableExampleTest {

    @Test
    public void testHashTableMethods() {
        HashTableExample hashTableExample = new HashTableExample();
        Hashtable<String, String> countryCodes = hashTableExample.getCountryCodes();

        // Check if the correct codes are retrieved
        Assertions.assertEquals("1", countryCodes.get("US"));
        Assertions.assertEquals("91", countryCodes.get("IN"));

        // Check if "UK" is present in the HashTable
        Assertions.assertFalse(countryCodes.containsKey("UK"));
    }
}