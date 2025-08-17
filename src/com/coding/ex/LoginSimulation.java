package com.coding.ex;

import java.util.Scanner;

public class LoginSimulation {
    public static void main(String[] args) {
        // Step 1: Store valid credentials
        String validUsername = "admin";
        String validPassword = "password123";

        Scanner sc = new Scanner(System.in);

        // Step 2: Allow 3 attempts
        int attempts = 0;
        boolean success = false;

        while(attempts < 3) {
            System.out.print("Enter Username: ");
            String username = sc.nextLine();

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            // Step 3: Validation
            if(username.equals(validUsername)) {
                if(password.equals(validPassword)) {
                    System.out.println("Login Successful. Welcome " + username);
                    success = true;
                    break;
                } else {
                    System.out.println("Invalid Password");
                }
            } else {
                System.out.println("User not found");
            }

            attempts++;
            System.out.println("Attempts left: " + (3 - attempts));
        }

        if(!success) {
            System.out.println("Account Locked. Too many failed attempts.");
        }

        sc.close();
    }
}
