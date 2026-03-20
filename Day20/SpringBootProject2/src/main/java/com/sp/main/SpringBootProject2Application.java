package com.sp.main;

import com.sp.main.beans.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootProject2Application implements CommandLineRunner
{

	public static void main(String[] args) {

		SpringApplication.run(SpringBootProject2Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		empBean1().display();
		System.out.println("------------------------------");
		empBean2().display();
	}

	@Bean
	public Employee empBean1()
	{
		return new Employee(121,"Amey","amey@example.com");
	}
	@Bean
	public Employee empBean2()
	{
		return new Employee(141,"Karan","karan@example.com");
	}

}
