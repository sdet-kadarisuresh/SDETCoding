package com.coding.basics;
import java.util.Scanner;

public class BrowserCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter browser name:");
        String browser = sc.nextLine().toLowerCase(); 

        switch (browser) {
            case "chrome":
                System.out.println("Launching Chrome Browser");
                break;
            case "firefox":
                System.out.println("Launching Firefox Browser");
                break;
            case "edge":
                System.out.println("Launching Edge Browser");
                break;
            case "safari":
                System.out.println("Launching Safari Browser");
                break;
            default:
                System.out.println("Browser not supported yet");
        }

        sc.close();
    }
}
