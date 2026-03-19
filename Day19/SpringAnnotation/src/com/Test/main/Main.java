package com.Test.main;

import com.Test.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){

        String resource_File_path = "/com/Test/resource/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(resource_File_path);

        Student std = (Student) context.getBean("student");

        std.display();

    }
}
