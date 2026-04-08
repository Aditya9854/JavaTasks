package com.sb.main.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private static final Logger logger = LoggerFactory.getLogger(NotificationService.class);
    private final ThreadPoolTaskExecutor notificationExecutor;

    public NotificationService(ThreadPoolTaskExecutor notificationExecutor)
    {
        this.notificationExecutor = notificationExecutor;
    }

    @Async("notificationExecutor")
    public void senEmail(String userEmail)
    {
        logger.info("Starting notification for : {} on thread {}",userEmail,Thread.currentThread().getName());

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
        logger.info("Notification sent to {}",userEmail);
        monitorPool();
    }
                           
    private void monitorPool()
    {
        logger.info("Pool Monitor -Active:{} pool size:{},Queue size:{}",
                notificationExecutor.getActiveCount(),
                notificationExecutor.getCorePoolSize(),
                notificationExecutor.getThreadPoolExecutor().getQueue().size());
    }
}
