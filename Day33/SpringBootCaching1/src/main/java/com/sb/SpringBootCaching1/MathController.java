package com.sb.SpringBootCaching1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    private final MathService mathService;

    public MathController(MathService mathService)
    {
        this.mathService = mathService;
    }

    @GetMapping("/square/{number}")
    public int getSquare(@PathVariable int number)
    {
        return mathService.computerSquare(number);
    }
}
