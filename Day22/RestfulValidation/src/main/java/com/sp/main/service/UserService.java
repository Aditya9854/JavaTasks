package com.sp.main.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.sp.main.dto.UserDTO;
import com.sp.main.model.User;
import com.sp.main.repository.UserRepository;

@Service
public class UserService {
	
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository)
	{
		this.userRepository = userRepository;
	}
	
	public List<UserDTO> getAllUsers()
	{
		
		return userRepository.findAll().stream()
				.map(this::mapToDTO)
				.collect(Collectors.toList());
	}
	
	public UserDTO createUser(UserDTO userDTO) 
	{
		
		User user = new User();
		
		user.setName(userDTO.getName());
		user.setEmail(userDTO.getEmail());
		user.setAge(userDTO.getAge());
		
		User savedUser = userRepository.save(user);
		return mapToDTO(savedUser);
	}
	
	public UserDTO findById(int id)
	{
		User user = userRepository.findById(id)
				.orElseThrow(()->new RuntimeException("User Not found"));
		return mapToDTO(user);
	}
	
	public UserDTO updateUser(int id,UserDTO userDTO )
	{
		User user = userRepository.findById(id)
				     .orElseThrow(()->new RuntimeException("User not found with id :"+id));
		user.setName(userDTO.getName());
		user.setEmail(userDTO.getEmail());
		user.setAge(userDTO.getAge());
		
		return mapToDTO(userRepository.save(user));
	}
	
	public void deleteUser(int id)
	{
		userRepository.deleteById(id);
	}
	//Helper method to convert entity to DTO
	private UserDTO mapToDTO(User user)
	{
		UserDTO dto = new UserDTO();
		
		dto.setId(user.getId());
		dto.setName(user.getName());
		dto.setEmail(user.getEmail());
		dto.setAge(user.getAge());
		
		return dto;
	}

}
