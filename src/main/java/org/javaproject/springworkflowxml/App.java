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
        Employee e = (Employee) context.getBean("employee");
        e.code();
    }
}
