package com.sp.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sp.main.dao.UserDao;
import com.sp.main.entity.Users;

@SpringBootApplication
public class SpringBootJdbcApplication implements CommandLineRunner
{
	@Autowired
	private UserDao userdao;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		
		Users user1 = new Users("Ankit","ankit@gmail.com","male","mumbai");
		boolean status = userdao.insertUser(user1);
		
		if(status)
		{
			System.out.println("User inserted successfully");
		}
		else
		{
			System.out.println("User not inserted due to some error");
		}
    }
	
}
