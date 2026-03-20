package com.testProgram.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class myController {

    @GetMapping("/")
    @ResponseBody
    public String getMsg()
    {
        return "This is Spring Boot Application!!";
    }
}
