package com.jh.iht.java.basics.collection2;

import java.util.Hashtable;

public class HashTableExample {
    public Hashtable<String, String> getCountryCodes() {
        Hashtable<String, String> countryCodes = new Hashtable<>();
        countryCodes.put("US", "1");
        countryCodes.put("IN", "91");
        countryCodes.put("DE", "49");
        return countryCodes;
    }
}