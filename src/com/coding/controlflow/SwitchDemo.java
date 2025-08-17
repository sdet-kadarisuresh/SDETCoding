package com.coding.controlflow;

public class SwitchDemo {
    public static void main(String[] args) {
        String browser = "firefox";

        switch(browser.toLowerCase()){
            case "chrome":
                System.out.println("Launching Chrome Browser");
                break;
            case "firefox":
                System.out.println("Launching Firefox Browser");
                break;
            case "edge":
                System.out.println("Launching Edge Browser");
                break;
            default:
                System.out.println("Browser not supported");
        }
    }
}
