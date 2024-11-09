package com.jh.iht.java.basics.types;

import java.util.Scanner;

public class OReadingInput {

    // Method to calculate the square of a number
    public int calculateSquare(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompting user to input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();  // Reading input
        
        // Creating an object of SquareCalculator
        OReadingInput calculator = new OReadingInput();
        
        // Calculating the square of the number
        int result = calculator.calculateSquare(number);
        
        // Printing the result
        System.out.println("The square of " + number + " is " + result);
        
        // Closing the scanner to avoid resource leak
        scanner.close();
    }
}