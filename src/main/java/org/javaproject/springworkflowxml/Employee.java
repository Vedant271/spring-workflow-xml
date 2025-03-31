package org.javaproject.springworkflowxml;

import org.springframework.lang.NonNullApi;

public class Employee {
    private int age;
    private Laptop laptop;

    public Employee(){
        System.out.println("Employee Created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter Called");
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void code(){
        System.out.println("Coding");
        laptop.compile();
    }
}
