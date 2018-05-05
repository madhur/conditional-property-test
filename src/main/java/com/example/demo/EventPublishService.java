package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(
        name = {"publish.feed.events"},
        havingValue = "true"
)
public class EventPublishService {


}
