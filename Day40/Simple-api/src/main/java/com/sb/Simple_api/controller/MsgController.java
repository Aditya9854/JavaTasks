package com.sb.Simple_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MsgController {

    @GetMapping("/api/greet")
    public Map<String,String>printMsg(@RequestParam(defaultValue = "world")String name)
    {
        return Map.of(
                "message","Hello "+name+"!",
                "status","Success"
        );
    }
}
