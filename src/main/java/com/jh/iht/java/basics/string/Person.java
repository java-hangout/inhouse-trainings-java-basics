package com.jh.iht.java.basics.string;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override toString() to return a custom string representation
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
