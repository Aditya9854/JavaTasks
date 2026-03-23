package com.sp.main.services;

import java.util.List;
import java.util.Optional;

import com.sp.main.entities.User;

public interface UserServices {
	
	public User createUser(User user);
	public List<User> getAllUsers();
	public Optional<User>getUserDetails(int id);
	public User updateUserDetails(int id, User user);
	public void deleteUserDetails(int id);
}
