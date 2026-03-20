package com.sp.main.config;

import com.sp.main.beans.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public CommandLineRunner cmdLineRunner()
    {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {

                empBean1().display();
                System.out.println("----------------------");
                empBean2().display();
            }
        };
    }

    @Bean
    public Employee empBean1()
    {
        return new Employee(1001,"Ram","ram@example.com");
    }
    @Bean
    public Employee empBean2()
    {
        return new Employee(1002,"virat","virat@example.com");
    }
}
