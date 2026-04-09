package com.sb.user_service.controller;

import com.sb.user_service.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    public User getUser(@PathVariable Long id)
    {
        return new User(id,"aditya","abc@example.com");
    }
}
