package com.coding.basics;
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;

     
        sc.close();
    }
}
