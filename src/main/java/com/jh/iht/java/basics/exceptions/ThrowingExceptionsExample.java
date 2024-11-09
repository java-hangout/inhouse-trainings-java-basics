package com.jh.iht.java.basics.exceptions;

class InvalidAgeException1 extends Exception {
    public InvalidAgeException1(String message) {
        super(message);
    }
}

class User {
    private int age;

    public void setAge(int age) throws InvalidAgeException1 {
        if (age < 0) {
            throw new InvalidAgeException1("Age cannot be negative");
        }
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}

public class ThrowingExceptionsExample {
    public static void main(String[] args) {
        User user = new User();
        
        try {
            user.setAge(-1);  // This should throw InvalidAgeException
        } catch (InvalidAgeException1 e) {
            System.out.println(e.getMessage());  // Expected output: "Age cannot be negative"
        }
    }
}