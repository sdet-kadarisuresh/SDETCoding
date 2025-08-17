package com.coding.basics;

public class OperatorDemo {
    public static void main(String[] args) {
        int a = 10, b = 3;

        System.out.println("Addition: " + (a + b));
        System.out.println("Division: " + (a / b));  
        System.out.println("Remainder: " + (a % b));  
        System.out.println("Greater? " + (a > b));    
        System.out.println("Logical AND: " + (a > 5 && b < 5));
    }
}