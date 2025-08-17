package com.coding.basics;
import java.util.Scanner;

public class Details {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age:");
        int age = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter the Name:");
        String name = sc.nextLine();

        System.out.println("Enter Salary:");
        double salary = sc.nextDouble();
        sc.nextLine(); 

        System.out.println("Enter Job role:");
        String role = sc.nextLine();

        System.out.println("\n===== User Details =====");
        System.out.println("Age is     : " + age);
        System.out.println("Name is    : " + name);
        System.out.println("Salary is  : " + salary);
        System.out.println("Job role is: " + role);

        sc.close();
    }
}
