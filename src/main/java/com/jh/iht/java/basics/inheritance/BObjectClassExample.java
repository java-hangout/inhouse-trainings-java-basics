package com.jh.iht.java.basics.inheritance;

class Person1 {
    String name;
    
    public Person1(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person1 person = (Person1) obj;
        return name.equals(person.name);
    }
}

public class BObjectClassExample {
    public static void main(String[] args) {
        Person1 p1 = new Person1("Alice");
        Person1 p2 = new Person1("Alice");
        Person1 p3 = new Person1("Bob");

        System.out.println(p1.toString());  // Outputs: Person{name='Alice'}
        System.out.println(p1.equals(p2));  // Outputs: true
        System.out.println(p1.equals(p3));  // Outputs: false
    }
}