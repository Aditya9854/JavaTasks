package com.sb.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAsync
public class SpringBootScheduler2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootScheduler2Application.class, args);
	}

}
