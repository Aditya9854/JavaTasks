package com.sb.SpringBootJwt3.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SecureController {

    @GetMapping("/user-data")
    public String getUserData()
    {
        return "This is accessible by anyone logged in.";
    }
    @GetMapping("/admin-data")
    @PreAuthorize("hasRole('ADMIN')")
    public String getAdminData()
    {
        return "This is restricted to ADMINS only.";
    }
}
