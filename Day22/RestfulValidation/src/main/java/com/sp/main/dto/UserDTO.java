package com.sp.main.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class UserDTO {
	
	private int id;
	
	@NotBlank(message = "Name cannot be empty")
	private  String name;
	
	@Email(message="Email should be valid")
	@NotBlank(message="Email is required!")
	private String email;
	@Min(value = 18,message = "Age must be at least 18")
	private int age;
	
	public UserDTO() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
