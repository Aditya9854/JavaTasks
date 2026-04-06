package com.sb.OpenApiApplication4.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "User and Document Management API",
                version = "1.0.0",
                description = "Unified API for managing user profiles and document "
        ),
        servers = {
                @Server(url = "http://localhost:8080",description = "Local dev"),
        }
)
public class OpenApiConfig {
}
