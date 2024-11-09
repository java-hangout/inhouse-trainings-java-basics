package com.jh.iht.java.basics.co;

class Person {
    String name;
    int age;

    // Constructor to initialize the name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class GConstructorsExample {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);  // Using the constructor to create a Person object
        person.displayInfo();  // Outputs: Name: Alice, Age: 30
    }
}