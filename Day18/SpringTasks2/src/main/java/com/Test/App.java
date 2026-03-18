package com.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[]args)
    {
        //to laod spring Container
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        System.out.println("---Requesting bean 1-----");
        Employee e1 = (Employee) context.getBean("empPrototype");
        e1.displayDetails();

        System.out.println("---Requesting bean 2-----");
        Employee e2 = (Employee) context.getBean("empPrototype");
        e2.displayDetails();
   b
        System.out.println("Are e1 and e2 are same? :"+(e1 == e2));  //because of prototype attribute in XML they will be different

        //to close container
        ((ClassPathXmlApplicationContext)context).close();

    }
}
