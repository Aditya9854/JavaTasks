package com.sb.order_service.controller;

import com.sb.order_service.client.UserClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final UserClient userClient;

    public OrderController(UserClient userClient)
    {
        this.userClient = userClient;
    }
    public Map<String, Object>getOrderDetails(@PathVariable String orderId,@PathVariable Long userId)
    {
        Object user = userClient.getUserById(userId);

        return Map.of(
                "orderId",orderId,
                "status","shipped",
                "userDetails",user
        );
    }
}
