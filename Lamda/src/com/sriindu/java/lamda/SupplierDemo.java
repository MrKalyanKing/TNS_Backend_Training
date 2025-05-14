package com.sriindu.java.lamda;

import java.util.function.Supplier; // Import the correct Supplier interface

// Demo for Supplier interface
public class SupplierDemo {

    public static void main(String[] args) {
        
        Supplier<Double> sup = () -> Math.random(); // Correct usage of Supplier
        System.out.println(sup.get());

    }
}