package com.sb.Service_A.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-a")
public class ServiceAController {

    @RequestMapping("/hello")
    public String sayHello()
    {
        return "Hello  from service A";
    }
}
