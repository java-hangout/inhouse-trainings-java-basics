package com.jh.iht.java.basics.pckg;

class Person1 {
    public String name;  // Accessible from anywhere
    private int age;     // Only accessible within this class
    protected String address;  // Accessible within the same package or subclasses
    String city;  // Default access modifier, accessible within the same package

    public Person1(String name, int age, String address, String city) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.city = city;
    }

    // Public method to access age (instead of accessing directly from outside)
   /* public void setAge(int age) throws IllegalAccessException {
        if (age < 0) {
            throw new IllegalAccessException("Age cannot be negative");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }*/

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address + ", City: " + city);
    }
}