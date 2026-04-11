package com.sb.order_service.controller;

import com.sb.order_service.model.OrderEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private KafkaTemplate<String, OrderEvent> kafkaTemplate;

    @PostMapping
    public String placeOrder(@RequestBody OrderEvent order)
    {
        order.setStatus("PENDING");

        kafkaTemplate.send("order_topics",order.getOrderId(),order);
        return "Order Placed Successfully";
    }
}
