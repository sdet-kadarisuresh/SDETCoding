package com.coding.OOPs;

//Parent class
class Person {
 String name;
 void walk(){
     System.out.println(name + " is walking");
 }
}

//Child class
class Student extends Person {
 int rollNo;
 void study(){
     System.out.println(name + " is studying");
 }
}

public class InheritanceDemo {
 public static void main(String[] args) {
     Student s1 = new Student();
     s1.name = "SK";
     s1.rollNo = 101;

     s1.walk();   // inherited
     s1.study();  // child class
 }
}
