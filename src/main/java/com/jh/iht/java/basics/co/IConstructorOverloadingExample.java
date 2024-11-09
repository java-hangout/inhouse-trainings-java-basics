package com.jh.iht.java.basics.co;

class Person1 {
    String name;
    int age;

    // Constructor with no parameters
    public Person1() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor with parameters
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class IConstructorOverloadingExample {
    public static void main(String[] args) {
        Person1 person1 = new Person1();  // Using the default constructor
        person1.displayInfo();  // Outputs: Name: Unknown, Age: 0

        Person1 person2 = new Person1("John", 25);  // Using the parameterized constructor
        person2.displayInfo();  // Outputs: Name: John, Age: 25
    }
}