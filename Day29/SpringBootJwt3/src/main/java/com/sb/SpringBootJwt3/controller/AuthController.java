package com.sb.SpringBootJwt3.controller;

import com.sb.SpringBootJwt3.config.JwtUtil;
import com.sb.SpringBootJwt3.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtUtil jwtUtil;

    public AuthController(JwtUtil jwtUtil)
    {
        this.jwtUtil = jwtUtil;
    }
    @PostMapping("/login")
    public Map<String,String>login(@RequestBody User user)
    {
        if ("admin".equals(user.getUsername()) && "password".equals(user.getPassword()) )
        {
            String token = jwtUtil.generateToken(user.getUsername(),"ADMIN");
            return Map.of("token",token);
        }
        return Map.of("error","Invalid Credentials");
    }
}
