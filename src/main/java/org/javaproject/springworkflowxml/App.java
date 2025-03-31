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

        Employee e1 = context.getBean("employee", Employee.class);
        System.out.println(e1.getAge());
        e1.code();

//        Without type casting
//        Desktop desktop = context.getBean("desktop", Desktop.class);

//        Without id tag
        Desktop desktop = context.getBean(Desktop.class);
    }
}
