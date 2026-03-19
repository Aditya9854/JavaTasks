package com.Test.main;

import com.Test.beans.Student;
import com.Test.resource.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

        Student std = (Student) context.getBean("student");

        std.display();

    }
}
