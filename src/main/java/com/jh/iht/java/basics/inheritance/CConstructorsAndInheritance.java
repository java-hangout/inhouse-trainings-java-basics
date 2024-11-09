package com.jh.iht.java.basics.inheritance;

class Animal2 {
    String name;

    public Animal2(String name) {
        this.name = name;
        System.out.println("Animal constructor called");
    }
}

class Dog2 extends Animal2 {
    public Dog2(String name) {
        super(name);  // Calling superclass constructor
        System.out.println("Dog constructor called");
    }
}

public class CConstructorsAndInheritance {
    public static void main(String[] args) {
        Dog1 dog = new Dog1("Buddy");
        // Outputs:
        // Animal constructor called
        // Dog constructor called
    }
}