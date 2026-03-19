package com.sp.main;

import com.sp.beans.Employee;
import com.sp.resource.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

        Employee emp = (Employee) context.getBean(Employee.class);

        emp.display();

    }
}
