package com.sp.main.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sp.main.dto.UserDTO;
import com.sp.main.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private final UserService userService;
	
	public UserController(UserService userService)
	{
		this.userService = userService;
	}
	
	@GetMapping
	public ResponseEntity<List<UserDTO>>getAll()
	{
		return ResponseEntity.ok(userService.getAllUsers());
	}
	
	@PostMapping
	public ResponseEntity<UserDTO>create(@Valid @RequestBody UserDTO userDTO)
	{
		return new ResponseEntity<>(userService.createUser(userDTO),HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<UserDTO>findById(@PathVariable int id)
	{
		return ResponseEntity.ok(userService.findById(id));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<UserDTO>update(@PathVariable int id,@Valid @RequestBody UserDTO userDTO)
	{
			return ResponseEntity.ok(userService.updateUser(id, userDTO));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void>delete(@PathVariable int id)
	{
		userService.deleteUser(id);
		return ResponseEntity.noContent().build();		
	}
	

	
}
