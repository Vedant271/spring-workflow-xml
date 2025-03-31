package org.javaproject.springworkflowxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");

        Employee e1 = (Employee) context.getBean("employee");
        System.out.println(e1.getAge());
        e1.code();

//        Employee e2 = (Employee) context.getBean("employee");
//        System.out.println(e2.age);
    }
}
