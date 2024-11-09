package com.jh.iht.java.basics.pckg;

public class EncapsulationExample {
    public static void main(String[] args) {
        // Create a new person object
        Person2 person = new Person2("Alice", 30);

        // Accessing private fields using public getter methods
        System.out.println("Name: " + person.getName());  // Alice
        System.out.println("Age: " + person.getAge());  // 30

        // Modifying private fields using setter methods
        person.setName("Bob");
        person.setAge(35);

        // Display the updated details
        person.display();  // Outputs: Name: Bob, Age: 35

        // Attempting to set an invalid age
        person.setAge(-5);  // Outputs: Age cannot be negative.
    }
}