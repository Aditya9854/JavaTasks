package com.sb.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootCaching2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCaching2Application.class, args);
	}

}
