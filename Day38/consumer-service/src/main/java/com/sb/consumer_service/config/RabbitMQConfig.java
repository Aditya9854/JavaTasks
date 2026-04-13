package com.sb.consumer_service.config;

import org.springframework.amqp.support.converter.JacksonJsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    public static final String QUEUE = "order-queue";

    @Bean
    public MessageConverter jasonMessageConverter()
    {
        return new JacksonJsonMessageConverter();
    }
}
