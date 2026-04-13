package com.sb.producer_service.controller;

import com.sb.producer_service.config.RabbitMQConfig;
import com.sb.producer_service.dto.OrderMessage;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/orders")
public class MessageController {

    private final AmqpTemplate amqpTemplate;

    public MessageController(AmqpTemplate amqpTemplate)
    {
        this.amqpTemplate = amqpTemplate;
    }

    public String sendOrder(@RequestBody OrderMessage order)
    {
        amqpTemplate.convertAndSend(
                RabbitMQConfig.EXCHANGE,
                RabbitMQConfig.ROUTING_KEY,
                order
        );
        return "Order sent to RabbitMQ";
    }
}
