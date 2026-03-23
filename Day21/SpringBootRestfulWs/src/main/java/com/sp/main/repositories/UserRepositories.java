package com.sp.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sp.main.entities.User;

public interface UserRepositories extends JpaRepository<User, Integer>
{
	
}
