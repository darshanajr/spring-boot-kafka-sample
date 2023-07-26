package com.darshanajr.springbootkafkasample.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic topic() {
        return TopicBuilder
                .name("notificationQueue")
                .partitions(1) // should increase with the number of instances
                .replicas(1)
                .build();
    }
}
