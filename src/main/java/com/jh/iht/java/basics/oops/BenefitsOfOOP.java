package com.jh.iht.java.basics.oops;// A simple example demonstrating the benefits of OOP

class Product {
    private String name;
    private double price;
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    // Encapsulation: Getter methods to access private fields
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Reusability and Modularity
    public double calculateDiscount(double discountPercentage) {
        return price - (price * discountPercentage / 100);
    }
}

class Electronics extends Product {
    private int warrantyYears;
    
    public Electronics(String name, double price, int warrantyYears) {
        super(name, price);
        this.warrantyYears = warrantyYears;
    }
    
    // Inheritance: Electronics inherits from Product
    public int getWarrantyYears() {
        return warrantyYears;
    }
}

public class BenefitsOfOOP {
    public static void main(String[] args) {
        // Create Product object using Encapsulation
        Product product = new Product("Laptop", 1000);
        
        // Demonstrate Modularity and Reusability
        System.out.println("Product: " + product.getName() + ", Price: $" + product.getPrice());
        double discountedPrice = product.calculateDiscount(10);  // 10% discount
        System.out.println("Discounted Price: $" + discountedPrice);

        // Create Electronics object using Inheritance
        Electronics laptop = new Electronics("Laptop", 1000, 2);
        System.out.println("Laptop Warranty: " + laptop.getWarrantyYears() + " years");
    }
}