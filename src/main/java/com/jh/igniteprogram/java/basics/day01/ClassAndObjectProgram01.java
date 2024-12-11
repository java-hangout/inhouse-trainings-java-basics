package com.jh.igniteprogram.java.basics.day01;

public class ClassAndObjectProgram01 {

    // A simple class to represent a person
    public static class Person {
        String name;
        int age;

        // Constructor to initialize the Person object
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Method to get the details of the person
        public String getDetails() {
            return "Name: " + name + ", Age: " + age;
        }
    }

    public static String run(String name, int age) {
        // Creating an object of the Person class
        Person person = new Person(name, age);
        
        // Returning the details of the person object
        return person.getDetails();
    }
}