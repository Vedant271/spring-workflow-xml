package org.javaproject.springworkflowxml;

public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop Created");
    }

    @Override
    public void compile(){
        System.out.println("Compiled from laptop");
    }
}
