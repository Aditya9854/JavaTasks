package in.sp.main;

import in.sp.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args)
    {
        String config_loc = "/in/sp/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);

        Student std = (Student) context.getBean("stdId");
        std.display();
    }
}
//for application context we have to download jar files
//spring-beans-xx.jar
//spring-core-xx.jar
//spring-context-xx.jar
//spring-expression-xx.jar
//commons-logging-xx.jar