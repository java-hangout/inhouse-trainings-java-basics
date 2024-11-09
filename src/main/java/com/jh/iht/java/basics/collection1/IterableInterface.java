package com.jh.iht.java.basics.collection1;

import java.util.ArrayList;
import java.util.List;

public class IterableInterface {
    public List<String> getProgrammingLanguages() {
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        return languages;
    }
}