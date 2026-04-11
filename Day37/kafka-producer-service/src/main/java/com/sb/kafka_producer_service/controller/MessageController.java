package com.sb.kafka_producer_service.controller;

import org.apache.kafka.common.internals.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "my_topic";

    @GetMapping("/publish")
    public String publishMessage(@RequestParam("message") String message)
    {
        //sending message to kafka
        kafkaTemplate.send(TOPIC,message);

        return "message send to Kafka successfully";
    }

}
