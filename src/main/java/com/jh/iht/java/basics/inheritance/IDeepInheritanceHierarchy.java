package com.jh.iht.java.basics.inheritance;

class Animal5 {
    public String eat() {
        System.out.println("Animal eats");
        return "Animal eats";
    }
}

class Mammal5 extends Animal5 {
    public String walk() {
        System.out.println("Mammal walks");
        return "Mammal walks";
    }
}

class Dog5 extends Mammal5 {
    public String bark() {
        System.out.println("Dog barks");
        return "Dog barks";
    }
}

public class IDeepInheritanceHierarchy {
    public static void main(String[] args) {
        Dog5 dog = new Dog5();
        dog.eat();  // Inherited from Animal
        dog.walk();  // Inherited from Mammal
        dog.bark();  // From Dog
    }
}