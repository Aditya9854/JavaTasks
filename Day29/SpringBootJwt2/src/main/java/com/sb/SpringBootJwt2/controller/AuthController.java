package com.sb.SpringBootJwt2.controller;

import com.sb.SpringBootJwt2.config.JwtUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.DocFlavor;
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
    public Map<String,String>login(@RequestBody Map<String,String>request)
    {
        String user = request.get("username");
        String pass = request.get("password");

        if ("admin".equals(user) && "password".equals(pass))
        {
            return Map.of("token",jwtUtil.generateToken(user,"ADMIN"));
        }
        return Map.of("error","Unauthorized");
    }
}
