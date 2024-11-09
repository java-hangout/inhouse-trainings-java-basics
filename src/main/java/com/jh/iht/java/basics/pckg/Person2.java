package com.jh.iht.java.basics.pckg;

// Class representing a Person with encapsulated fields
class Person2 {
    // Private fields
    private String name;
    private int age;

    // Constructor to initialize the person object
    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if(age >= 0) {  // Validation to ensure non-negative age
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    // Display method to show the details of the person
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}