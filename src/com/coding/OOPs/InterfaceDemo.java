package com.coding.OOPs;

interface WebDriverInterface {
    void openBrowser();
    void closeBrowser();
}

class ChromeDriverImpl implements WebDriverInterface {
    public void openBrowser(){
        System.out.println("Chrome opened");
    }
    public void closeBrowser(){
        System.out.println("Chrome closed");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        WebDriverInterface driver = new ChromeDriverImpl();
        driver.openBrowser();
        driver.closeBrowser();
    }
}
