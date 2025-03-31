package org.javaproject.springworkflowxml;

import org.springframework.lang.NonNullApi;

public class Employee {
    private int age;
    private Computer laptop;

    public Employee(){
        System.out.println("Employee Created");
    }

    public Employee(int age, Computer laptop) {
        System.out.println("Parameterised Constructor Called");
        this.age = age;
        this.laptop = laptop;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getLaptop() {
        return laptop;
    }

    public void setLaptop(Computer laptop) {
        this.laptop = laptop;
    }

    public void code(){
        System.out.println("Coding");
        laptop.compile();
    }
}
