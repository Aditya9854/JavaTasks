package com.sb.SpringBootCaching3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootCaching3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCaching3Application.class, args);
	}

}
