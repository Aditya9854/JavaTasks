package com.sb.SpringBootCaching1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootCaching1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCaching1Application.class, args);
	}

}
