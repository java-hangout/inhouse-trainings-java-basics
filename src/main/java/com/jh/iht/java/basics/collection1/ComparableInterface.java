package com.jh.iht.java.basics.collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age); // Compare by age
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }
}

public class ComparableInterface {
    public List<Person> getPeople(List<Person> people ) {
        // Sort people by age
        Collections.sort(people);
        return people;
    }
}