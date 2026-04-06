package com.sb.OpenApiApplication2.config;

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
           @Server(url = "http://qa.myapp.com",description = "QA testing server"),
           @Server(url = "http://api.myapp.com",description = "Production server")
        }
)
public class OpenApiConfig {
}
