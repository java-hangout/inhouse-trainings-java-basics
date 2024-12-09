package com.jh.iht.javabasics;

public class Car {

    // Encapsulation: Private fields
    private String model;
    private int year;
    private static int carCount = 0;  // Static member to track number of cars created

    // Constructor Overloading: Two constructors with different parameter signatures
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        carCount++;  // Increment carCount whenever a car object is created
    }

    public Car(String model) {
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
        System.out.println("Car Model: " + model + ", Year: " + year);
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
        // Run the test cases manually
        testCreateCar();
        testCreateCarWithDefaultYear();
        testDisplayCarInfo();
        testGetCarCount();
    }

    // 1. Test case: Creating a Car object and checking the model and year
    public static void testCreateCar() {
        System.out.println("Running testCreateCar...");
        Car car = new Car("Toyota", 2020);
        if (car.getModel().equals("Toyota") && car.getYear() == 2020) {
            System.out.println("testCreateCar PASSED");
        } else {
            System.out.println("testCreateCar FAILED");
        }
    }

    // 2. Test case: Creating a Car object with default year and checking the model
    public static void testCreateCarWithDefaultYear() {
        System.out.println("Running testCreateCarWithDefaultYear...");
        Car car = new Car("Honda");
        if (car.getModel().equals("Honda") && car.getYear() == 2024) {
            System.out.println("testCreateCarWithDefaultYear PASSED");
        } else {
            System.out.println("testCreateCarWithDefaultYear FAILED");
        }
    }

    // 3. Test case: Display car information and checking output manually
    public static void testDisplayCarInfo() {
        System.out.println("Running testDisplayCarInfo...");
        Car car = new Car("BMW", 2023);
        // Manually verify if the displayed car info matches expected output
        System.out.println("Expected: Car Model: BMW, Year: 2023");
        car.displayCarInfo();
    }

    // 4. Test case: Checking total car count
    public static void testGetCarCount() {
        System.out.println("Running testGetCarCount...");
        Car car1 = new Car("Toyota", 2020);
        Car car2 = new Car("Honda");
        int expectedCarCount = 2;
        if (Car.getCarCount() == expectedCarCount) {
            System.out.println("testGetCarCount PASSED");
        } else {
            System.out.println("testGetCarCount FAILED");
        }
    }
}
