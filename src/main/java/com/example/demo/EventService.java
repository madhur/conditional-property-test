package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;


@Service
public class EventService {

    @Autowired
    @Lazy
    private EventPublishService eventPublishService;

    @Value("${publish.feed.events:false}")
    private boolean isPublishEvents;

    public EventService() {
    }
}
