package com.coding.OOPs;

abstract class Shape {
    abstract void draw();  // abstract method
    void info(){           // concrete method
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    void draw(){
        System.out.println("Drawing Circle");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Shape s = new Circle();  // Polymorphism
        s.draw();
        s.info();
    }
}
