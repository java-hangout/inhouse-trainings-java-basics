package com.jh.iht.java.basics.inheritance;

class Animal1 {
    String name;

    public Animal1(String name) {
        this.name = name;
    }

    public String speak() {
        System.out.println(name + " makes a sound");
        return name + " makes a sound";
    }
}

class Dog1 extends Animal1 {
    public Dog1(String name) {
        super(name);
    }

    @Override
    public String speak() {
        System.out.println(name + " barks");
        return name + " barks";
    }
}

public class AInheritanceExample {
    public static void main(String[] args) {
        Dog1 dog1 = new Dog1("Buddy");
        dog1.speak(); // Outputs: Buddy barks
    }
}