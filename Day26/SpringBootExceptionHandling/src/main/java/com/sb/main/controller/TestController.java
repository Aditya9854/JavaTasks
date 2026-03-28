package com.sb.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.main.exception.ResourceNotFoundException;

@RestController
@RequestMapping("/test")
public class TestController {

	@GetMapping("/not-found")
	public void triggerNotFound()
	{
		throw new ResourceNotFoundException("User with  id 999 not found in database.");
	}
	
	public void triggerGenericError() 
	{
		throw new RuntimeException("Something went wrong in the system.");
	}
}
