package com.coding.OOPs;

class Employee {
    private String name;
    private int salary;

    // Getter & Setter
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setSalary(int salary){
        if(salary > 0){
            this.salary = salary;
        }
    }

    public int getSalary(){
        return this.salary;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("SDET Sk");
        e1.setSalary(60000);

        System.out.println("Name: " + e1.getName());
        System.out.println("Salary: " + e1.getSalary());
    }
}
