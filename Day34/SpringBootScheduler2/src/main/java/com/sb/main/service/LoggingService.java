package com.sb.main.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
public class LoggingService {

    private static final Logger logger = LoggerFactory.getLogger(LoggingService.class);

    //for every 10 min
    @Scheduled(fixedRate = 600000)
    public void logSystemData(){

        logger.info("System health check at: {}", LocalDateTime.now());
    }
}
