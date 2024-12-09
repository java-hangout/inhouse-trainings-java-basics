package com.jh.iht.javabasics;

public class ClassAndObjectTopic {

    // Encapsulation: Private fields
    private String model;
    private int year;
    private static int carCount = 0;  // Static member to track number of cars created

    // Constructor Overloading: Two constructors with different parameter signatures
    public ClassAndObjectTopic(String model, int year) {
        this.model = model;
        this.year = year;
        carCount++;  // Increment carCount whenever a car object is created
    }

    public ClassAndObjectTopic(String model) {
        this.model = model;
        this.year = 2024;  // Default year
        carCount++;
    }

    // Getter and Setter methods (Encapsulation)
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Abstraction: Method that hides the implementation details of car information
    public void displayCarInfo() {
        System.out.println("ClassAndObjectTopic Model: " + model + ", Year: " + year);
    }

    // Method Overloading: A method that displays additional information based on the input
    public void displayCarInfo(boolean showCarCount) {
        displayCarInfo();
        if (showCarCount) {
            System.out.println("Total cars created: " + carCount);
        }
    }

    // Static Method: A static method to get the car count
    public static int getCarCount() {
        return carCount;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create car objects
        ClassAndObjectTopic car1 = new ClassAndObjectTopic("Toyota", 2020);
        ClassAndObjectTopic car2 = new ClassAndObjectTopic("Honda");

        // Display car information
        System.out.println("ClassAndObjectTopic 1 Info:");
        car1.displayCarInfo(true);  // Show car info along with car count

        System.out.println("\nClassAndObjectTopic 2 Info:");
        car2.displayCarInfo(false);  // Show car info without car count

        // Display total number of cars created
        System.out.println("\nTotal cars created: " + ClassAndObjectTopic.getCarCount());  // Static method call

        // Testing setter methods
        car1.setModel("BMW");
        car1.setYear(2023);
        System.out.println("\nAfter updating ClassAndObjectTopic 1 Info:");
        car1.displayCarInfo(true);  // Display updated info of car1
    }
}
