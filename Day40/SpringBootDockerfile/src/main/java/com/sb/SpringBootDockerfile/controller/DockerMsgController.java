package com.sb.SpringBootDockerfile.controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DockerMsgController {

    public Map<String,String>Msg(@RequestParam(name = "Welcome")String name)
    {
        return Map.of(
              "Message:","Hello "+name+"!",
               "Status:","Success"
        );
    }
}
