package com.jh.iht.java.basics.inheritance;

class Person2 {
    public String name;  // Accessible from anywhere
    private int age;  // Only accessible within this class

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class DAccessModifiersExample {
    public static void main(String[] args) {
        Person2 p = new Person2("Alice", 30);
        System.out.println(p.name);  // Accessible
        // System.out.println(p.age);  // Error: age is private
        p.displayInfo();  // Outputs: Name: Alice, Age: 30
    }
}