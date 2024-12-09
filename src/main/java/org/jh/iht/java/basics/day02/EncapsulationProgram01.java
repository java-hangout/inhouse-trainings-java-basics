package org.jh.iht.java.basics.day02;

public class EncapsulationProgram01 {

    // Private fields (EncapsulationProgram01)
    private String name;
    private int age;

    // Public constructor to initialize the object
    public EncapsulationProgram01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for 'name'
    public String getName() {
        return name;
    }

    // Setter for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter for 'age'
    public int getAge() {
        return age;
    }

    // Setter for 'age'
    public void setAge(int age) {
        this.age = age;
    }

    // Method to display user info (using EncapsulationProgram01)
    public String displayInfo() {
        return "Name: " + getName() + ", Age: " + getAge();
    }

    // Static method for demonstration
    public static String run(String name, int age) {
        // Create an object with encapsulated fields
        EncapsulationProgram01 person = new EncapsulationProgram01(name, age);

        // Return formatted string displaying user info
        return person.displayInfo();
    }
}