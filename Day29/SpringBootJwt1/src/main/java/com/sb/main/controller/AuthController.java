package com.sb.main.controller;

import com.sb.main.config.JwtService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtService jwtService;

    public AuthController(JwtService jwtService)
    {
        this.jwtService = jwtService;
    }

    @PostMapping("/login")
    public Map<String,String> login(@RequestBody Map<String,String> request)
    {
        if ("admin".equals(request.get("username")) && "password".equals(request.get("password")))
        {
            String token = jwtService.generateToken(request.get("username"));
            return Collections.singletonMap("token",token);
        }
        throw new RuntimeException("Invalid Credentials");
    }
}
