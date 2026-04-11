package com.sb.notification_service.service;

import com.sb.notification_service.model.OrderEvent;
import org.springframework.stereotype.Service;

@Service
public class NotificationListener {

    public void consumeOrderEvent(OrderEvent event)
    {
        System.out.println("....Notification Sent.....");
        System.out.println("Order Received : "+event.getOrderId());
        System.out.println("Product : "+event.getProduct());
        System.out.println("Amount to be paid : "+event.getPrice());
        System.out.println("___________________________________");

    }
}
