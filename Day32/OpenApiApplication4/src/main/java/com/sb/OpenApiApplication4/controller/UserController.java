package com.sb.OpenApiApplication4.controller;

import com.sb.OpenApiApplication4.dto.UserRequest;
import com.sb.OpenApiApplication4.dto.UserResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/users")
@Tag(name = "User Services",description = "Endpoints for finding and searching users.")
public class UserController {

    @PostMapping
    @Operation(
            summary = "Create new User",
            description = "This API accepts user details,validates them and returns generated id with success status"

    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201",description = "User Created Successfully",
                            content = {@Content(mediaType = "application/json",
                                    schema = @Schema(implementation = UserResponse.class))}),
            @ApiResponse(responseCode = "400",description = "Invalid Input-check request body",
                            content = @Content),
            @ApiResponse(responseCode = "500",description = "Internal Server Error",
                            content = @Content)
    })
    public ResponseEntity<UserResponse> createUser(@RequestBody UserRequest request)
    {
        UserResponse response = new UserResponse(5001l,request.getName(),"Created");
        return ResponseEntity.status(201).body(response);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Find user by id",description = "Provide an id to look up a specific user in the system.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",description = "User Found"),
            @ApiResponse(responseCode = "404",description = "User Not Found",content = @Content)
    })
    public UserResponse getUserById(
            @Parameter(
                    name = "id",
                    description = "Numeric id of user to retrive",
                    required = true,example = "500")
            @PathVariable Long id)
    {
        return new UserResponse(id,"abc xyz","fetched by id");
    }

    @GetMapping("/filter")
    @Operation(summary = "Filter users by status")
    public UserResponse filterUsers(
            @Parameter(
                    name = "status",
                    description = "Account status (eg: active,pending",
                    required = false,
                    example = "Active"
            )
            @RequestParam(required = false)String status)
    {
        return new UserResponse(1l,"abc xys","Status:"+status );
    }
}
