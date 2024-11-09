package com.jh.iht.java.basics.oops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 * Problem: Demonstrate the benefits of OOP (Modularity, Reusability, Inheritance, Maintainability).
 *
 * Input:
 * - Product object: Name = "Laptop", Price = 1000
 * - Electronics object: Name = "Laptop", Price = 1000, Warranty = 2 years
 * 
 * Expected Output:
 * - Product Name: Laptop, Price: 1000
 * - Discounted Price (10%): 900
 * - Electronics Warranty: 2 years
 */
public class BenefitsOfOOPTest {

    @Test
    public void testProduct() {
        Product product = new Product("Laptop", 1000);
        Assertions.assertEquals("Laptop", product.getName());
        Assertions.assertEquals(1000, product.getPrice(), 0.01);
    }

    @Test
    public void testCalculateDiscount() {
        Product product = new Product("Laptop", 1000);
        double discountedPrice = product.calculateDiscount(10);  // 10% discount
        Assertions.assertEquals(900, discountedPrice, 0.01);
   

 }

    @Test
    public void testElectronics() {
        Electronics laptop = new Electronics("Laptop", 1000, 2);
        Assertions.assertEquals("Laptop", laptop.getName());
        Assertions.assertEquals(1000, laptop.getPrice(), 0.01);
        Assertions.assertEquals(2, laptop.getWarrantyYears());
    }
}