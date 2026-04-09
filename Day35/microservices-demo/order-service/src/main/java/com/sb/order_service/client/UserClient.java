package com.sb.order_service.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//url points to the user service port
@FeignClient(name = "user-service",url = "http://localhost:8081")
public interface UserClient {
    @GetMapping("/user/{id}")
    Object getUserById(@PathVariable("id")Long id);
}
