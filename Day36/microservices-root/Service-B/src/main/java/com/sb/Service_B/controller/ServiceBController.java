package com.sb.Service_B.controller;

import com.sb.Service_B.client.ServiceAClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-b")
public class ServiceBController {

    private final ServiceAClient serviceAClient;

    public ServiceBController(ServiceAClient serviceAClient)
    {
        this.serviceAClient = serviceAClient;
    }

    @GetMapping("/consume")
    public String consume()
    {
        return "Service-b received : "+serviceAClient.callServiceA();
    }
}
