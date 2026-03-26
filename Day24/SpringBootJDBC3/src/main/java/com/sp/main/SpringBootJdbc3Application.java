package com.sp.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sp.main.dao.UserDao;
import com.sp.main.entity.Users;

@SpringBootApplication
public class SpringBootJdbc3Application implements CommandLineRunner
{
	@Autowired
	private UserDao userdao;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbc3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		Users user1 = new Users("ajay","ajay@gmail.com","male","pune");
//		boolean status = userdao.insertUser(user1);
//		
//		if(status)
//		{
//			System.out.println("User inserted successfully");
//		}
//		else
//		{
//			System.out.println("User not inserted due to some error");
//		}
//		
//		Users user1 = new Users("Ankit","ankit@ankitgmail.com","male","Satara");
//	    boolean status = userdao.updateUser(user1);
//	      
//	    if(status)
//	    {
//	      System.out.println("User inserted successfully");
//	    }
//	    else
//	    {
//	     System.out.println("User not inserted due to some error");
//	    }	  
		
//		boolean status = userdao.DeleteUserByEmail("ankit@gmail.com");
//		
//		if(status)
//		{
//			System.out.println("Deletion Success");
//		}
//		else
//		{
//			System.out.println("Deletion Failed");
//		}
			
		Users user = userdao.getUserByEmail("ajay@gmail.com");
		
		System.out.println("Name : "+user.getName());
		System.out.println("Email : "+user.getEmail());
		System.out.println("Gender : "+user.getGender());
		System.out.println("City : "+user.getCity());
	}

}
