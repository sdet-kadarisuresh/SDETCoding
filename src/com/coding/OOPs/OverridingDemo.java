package com.coding.OOPs;

class Browser {
    void launch(){
        System.out.println("Launching generic browser");
    }
}

class Chrome extends Browser {
    @Override
    void launch(){
        System.out.println("Launching Chrome Browser");
    }
}

class Firefox extends Browser {
    @Override
    void launch(){
        System.out.println("Launching Firefox Browser");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Browser b = new Chrome();   // Upcasting
        b.launch(); // Chrome version runs
    }
}
