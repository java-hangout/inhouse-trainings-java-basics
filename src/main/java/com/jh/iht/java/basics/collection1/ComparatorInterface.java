package com.jh.iht.java.basics.collection1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person1{
    String name;
    int age;

    Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }
}

public class ComparatorInterface {
    public List<Person1> getPeople(List<Person1> people) {
        // Sort exceptedResult by name using the Comparator
        Collections.sort(people, sortByName());
        return people;
    }

    // Comparator to sort by name
    public Comparator<Person1> sortByName() {
        return (p1, p2) -> p1.name.compareTo(p2.name);
    }
}