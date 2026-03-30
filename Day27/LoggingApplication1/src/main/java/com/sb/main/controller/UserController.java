package com.sb.main.controller;

import com.sb.main.model.User;
import com.sb.main.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    private final UserService userService;

    public UserController(UserService userService)
    {
        this.userService = userService;
    }

    @PostMapping
    public String createUser(@RequestBody User user)
    {
        log.info("API triggered: Create User Request for {}",user.getName());
        try {
            userService.registerUser(user);
            return "User created successfully";
        } catch (Exception e) {
            log.error("Critical error while creating user {}: ", user.getName(), e);
            return "Error occurred";
        }
    }
}
