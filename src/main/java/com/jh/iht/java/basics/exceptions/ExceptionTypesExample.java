package com.jh.iht.java.basics.exceptions;

// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Person class to demonstrate exception handling
class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws InvalidAgeException {
        this.name = name;
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative.");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class ExceptionTypesExample {
    public static void main(String[] args) {
        try {
            Person person = new Person("John", 30);  // Valid person
            System.out.println("Age: " + person.getAge());  // Expected output: 30

            // Invalid person creation (throws InvalidAgeException)
            Person invalidPerson = new Person("Alice", -5);  // Should throw InvalidAgeException

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());  // Expected output: "Age cannot be negative."
        }
    }
}