package com.sb.kafka_producer_service.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;


@Configuration
public class KafkaConfig {

    public NewTopic myTopic()
    {
        return TopicBuilder.name("my_topic")
                .partitions(3)
                .replicas(1)
                .build();
    }
}
