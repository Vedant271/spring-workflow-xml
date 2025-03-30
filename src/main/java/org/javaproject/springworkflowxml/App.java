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

        // At this stage only one object is created with age having default int value
        Employee e1 = (Employee) context.getBean("employee");
        e1.age = 20;
        System.out.println(e1.age);
//        e1.code();

        Employee e2 = (Employee) context.getBean("employee");
        System.out.println(e2.age);
    }
}
