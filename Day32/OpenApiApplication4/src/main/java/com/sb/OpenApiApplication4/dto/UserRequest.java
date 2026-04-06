package com.sb.OpenApiApplication4.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Schema(description = "Data required to create update a user")
public class UserRequest {

    @Schema(description = "Full name of the user",example = "abc xyz")
    @NotBlank(message = "Name is required")
    @Size(min = 2,max = 50)
    private String name;

    @Schema(description = "Valid email address",example = "abc@example.com")
    @Email(message = "Invalid email format")
    @NotBlank(message = "Email is required.")
    private String email;

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
}
