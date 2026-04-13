package com.sb.producer_service.config;

import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.JacksonJsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.*;

@Configuration
public class RabbitMQConfig {

    public static final String QUEUE = "order_queue";
    public static final String EXCHANGE = "order_exchange";
    public static final String ROUTING_KEY = "order_routing_key";

    @Bean
    public Queue queue()
    {
        return QueueBuilder.durable(QUEUE).build();
    }

    @Bean
    public TopicExchange exchange()
    {
        return ExchangeBuilder.topicExchange(EXCHANGE).build();
    }

    @Bean
    public Binding binding(Queue queue, TopicExchange exchange)
    {
        return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY);
    }

    @Bean
    public  MessageConverter jasonMessageConverter()
    {
        return new JacksonJsonMessageConverter();
    }

    @Bean
    public AmqpTemplate amqpTemplate(ConnectionFactory connectionFactory)
    {
        final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(jasonMessageConverter());
        return rabbitTemplate;

    }
}
