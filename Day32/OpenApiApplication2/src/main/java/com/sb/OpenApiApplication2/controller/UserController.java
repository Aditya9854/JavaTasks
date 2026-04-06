package com.sb.OpenApiApplication2.controller;

import com.sb.OpenApiApplication2.dto.UserRequest;
import com.sb.OpenApiApplication2.dto.UserResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@Tag(name = "USer Management",description = "API's for creating and managing users")
public class UserController {

    @PostMapping
    @Operation(summary = "Create new User",description = "Takes user request and returns created user profile")
    public UserResponse createUser(@RequestBody UserRequest request){

        return new UserResponse(101l,request.getName(),"Active");
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get User by ID")
    public UserResponse getUser(@PathVariable Long id)
    {
        return new UserResponse(id,"Ajay","Verified");
    }
}
