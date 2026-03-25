package com.sp.validation.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sp.validation.dto.UserDTO;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@PostMapping("/register")
    public ResponseEntity<?> registerUser(@Valid @RequestBody UserDTO userDTO, BindingResult result) {
        
        if (result.hasErrors()) {
            Map<String, String> errors = new HashMap<>();
            
            for (FieldError error : result.getFieldErrors()) {
                errors.put(error.getField(), error.getDefaultMessage());
            }
            
            return ResponseEntity.badRequest().body(errors);
        }

        return ResponseEntity.ok("User is valid and registered!");
    }

}
