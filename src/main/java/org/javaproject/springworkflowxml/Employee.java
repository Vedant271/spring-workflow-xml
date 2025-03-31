package org.javaproject.springworkflowxml;

public class Employee {
    private int age;

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

    public void code(){
        System.out.println("Coding");
    }
}
