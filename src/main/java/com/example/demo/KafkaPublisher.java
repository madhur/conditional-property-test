package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class KafkaPublisher {

    @Value("${kafka.producer.financial_feed.topic}")
    private String financeFeedTopic;

}
