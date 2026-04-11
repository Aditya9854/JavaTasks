package com.sb.kafka_consumer_service.service;

import org.springframework.stereotype.Service;

@Service
public class KafkaConService {

    public void consume(String message)
    {
        System.out.println("Consumed Message : "+message);
    }
}
