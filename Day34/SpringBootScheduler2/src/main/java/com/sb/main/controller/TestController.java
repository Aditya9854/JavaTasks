package com.sb.main.controller;

import com.sb.main.service.NotificationService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final NotificationService notificationService;

    public TestController(NotificationService notificationService)
    {
        this.notificationService = notificationService;
    }

    public String triggerNotification(@RequestParam String email)
    {
        notificationService.senEmail(email);
        return "Notification process started for : "+email;
    }
}
