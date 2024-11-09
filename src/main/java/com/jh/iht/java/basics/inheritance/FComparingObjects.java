package com.jh.iht.java.basics.inheritance;

class Person3 {
    String name;

    public Person3(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person3 person = (Person3) obj;
        return name.equals(person.name);
    }
}

public class FComparingObjects {
    public static void main(String[] args) {
        Person3 p1 = new Person3("Alice");
        Person3 p2 = new Person3("Alice");

        System.out.println(p1 == p2);  // false, reference comparison
        System.out.println(p1.equals(p2));  // true, logical equality
    }
}