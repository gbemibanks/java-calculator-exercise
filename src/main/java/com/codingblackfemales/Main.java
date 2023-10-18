package com.codingblackfemales;

public class Main {
    public static void main(String[] args) {
        System.out.println("Addition: " + Calculator.add(5, 3));
        System.out.println("Subtraction: " + Calculator.subtract(5, 3));
        System.out.println("Multiplication: " + Calculator.multiply(5, 3));
        System.out.println("Division: " + Calculator.divide(5, 3));
    
        //  the following line to demonstrate the division by zero exception
        System.out.println("Division by zero: " + Calculator.divide(5, 0));
    }
    
}
