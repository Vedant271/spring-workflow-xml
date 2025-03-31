package org.javaproject.springworkflowxml;

public class Desktop implements Computer {
    @Override
    public void compile(){
        System.out.println("Complied from desktop");
    }
}
