package org.javaproject.springworkflowxml;

public class Desktop implements Computer {
    public Desktop(){
        System.out.println("Desktop Created");
    }

    @Override
    public void compile(){
        System.out.println("Complied from desktop");
    }
}
