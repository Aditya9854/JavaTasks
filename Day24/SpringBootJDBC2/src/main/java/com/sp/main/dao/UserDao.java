package com.sp.main.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sp.main.entity.Users;

@Repository
public class UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public boolean insertUser(Users user)
	{
		boolean status = false;
		
		try {
			  String insert_sql_query = "INSERT into users(name,email,gender,city)values(?,?,?,?)";
			  int count = jdbcTemplate.update(insert_sql_query, user.getName(),user.getEmail(),user.getGender(),user.getCity());
			  if(count > 0)
			  {
				  status = true;
			  }
			  else
			  {
				  status = false;
			  }
			  
		}
		catch(Exception e)
		{
			status = false;
			e.printStackTrace();
		}
		return status;
	}
	public boolean updateUser(Users user)
	{
		boolean status = false;
		
		try {
			String update_sql_query = "update users set name = ?,gender = ?,city = ? where email = ?";
			int count = jdbcTemplate.update(update_sql_query, user.getName(),user.getGender(),user.getCity(),user.getEmail());
			
			if(count > 0)
			{
				status = true;
			}
			else 
			{
				status = false;
			}
		}
		catch(Exception e)
		{
			status = false;
			e.printStackTrace();
		}
		
		return status;
	}

}
