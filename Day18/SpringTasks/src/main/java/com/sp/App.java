package com.sp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[]args)
    {
        //to laod spring Container
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        System.out.println("---Using Constructor Injection-----");
        Employee emp1 = (Employee) context.getBean("empConstructor");
        emp1.displayDetails();

        System.out.println("----Using Setter Injection----");
        Employee emp2 = (Employee) context.getBean("empSetter");
        emp2.displayDetails();

        ((ClassPathXmlApplicationContext)context).close();

    }
}
