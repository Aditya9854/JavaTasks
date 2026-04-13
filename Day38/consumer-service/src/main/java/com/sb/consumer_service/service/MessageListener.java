package com.sb.consumer_service.service;

import com.sb.consumer_service.dto.OrderMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MessageListener {

    public void receive(OrderMessage message)
    {
        log.info("Received from Queue:{}|Thread ID:{}",
                      message,Thread.currentThread().threadId());
    }
}
