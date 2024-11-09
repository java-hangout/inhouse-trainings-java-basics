package com.jh.iht.java.basics.pckg;

public class AccessModifiersExample {
    public static void main(String[] args) {
        Person1 p = new Person1("John", 30, "123 Main St", "New York");
        System.out.println(p.name);  // Accessible
        // System.out.println(p.age);  // Error: age is private
        System.out.println(p.address);  // Accessible within the same package
        System.out.println(p.city);  // Accessible within the same package

        p.displayInfo();  // Outputs: Name: John, Age: 30, Address: 123 Main St, City: New York
    }
}