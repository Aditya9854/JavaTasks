package com.sp.validation.dto;

import com.sp.validation.validator.ContactNumber;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserDTO {
	
	@NotBlank(message = "Username is required") // 1
    private String username;

    @Email(message = "Please provide a valid email") // 2
    private String email;

    @Min(value = 18, message = "Age must be at least 18") // 3
    private int age;

    @Size(min = 6, max = 12, message = "Password must be 6-12 characters") // 4
    private String password;

    @ContactNumber // 5 (Custom Validator)
    private String phone;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
