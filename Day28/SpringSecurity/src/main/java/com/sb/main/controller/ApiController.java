package com.sb.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/public/info")
    public String publicEndpoint()
    {
        return "This is public info";
    }

    @GetMapping("/user/profile")
    public String userEndpoint()
    {
        return "Welcome User!";
    }

    @GetMapping("admin/dashboard")
    public String adminEndpoint()
    {
        return "Welcome to the Admin Dashboard!";
    }
}
