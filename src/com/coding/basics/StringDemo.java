package com.coding.basics;

public class StringDemo {
    public static void main(String[] args) {
        String browser = "chrome";

        System.out.println("Length: " + browser.length());
        System.out.println("Upper: " + browser.toUpperCase());
        System.out.println("Contains 'me'? " + browser.contains("me"));
        System.out.println("Equals? " + browser.equals("chrome"));
        System.out.println("Substring: " + browser.substring(0,3));
    }
}
