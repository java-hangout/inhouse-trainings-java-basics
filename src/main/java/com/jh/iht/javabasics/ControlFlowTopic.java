package com.jh.iht.javabasics;

public class ControlFlowTopic {

    // Static method to classify numbers using comparison and logical operators
    public static String processNumber(int num) {
        if (num > 0) {
            return "Positive";
        } else if (num < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    // Static method for FizzBuzz using correct logic
    public static String fizzBuzz(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";  // divisible by both 3 and 5
        } else if (num % 3 == 0) {
            return "Fizz";      // divisible by of 3 only
        } else if (num % 5 == 0) {
            return "Buzz";      // divisible by of 5 only
        } else {
            return Integer.toString(num);  // Other numbers
        }
    }

    // Static method for using loops (for, while, do-while) with break and continue
    public static int sumEvenNumbers() {
        int sum = 0;
        for (int i = 2; i <= 20; i += 2) {  // Only loop over even numbers (i = 2, 4, 6, ..., 20)
            if (sum + i > 100) {
                break;  // Stop summing once adding this even number would exceed 100
            }
            sum += i;  // Add the even number to the sum
        }
        return sum;
    }


    // Method to demonstrate a for-each loop (now returns a String for testing)
    public static String printNumbers(int[] numbers) {
        StringBuilder result = new StringBuilder();
        for (int number : numbers) {
            result.append(number).append(" ");
        }
        return result.toString().trim();  // Return the result as a string
    }

    // Main function (optional, for testing purposes)
    public static void main(String[] args) {
        // Example usage of the static methods
        System.out.println(ControlFlowTopic.processNumber(5));   // Positive
        System.out.println(ControlFlowTopic.fizzBuzz(15));        // FizzBuzz
        System.out.println(ControlFlowTopic.sumEvenNumbers());   // Sum of even numbers
        int[] numbers = {1, 2, 3, 4, 5};
        ControlFlowTopic.printNumbers(numbers);  // Prints numbers 1 to 5
    }
}
