package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1")
public class Testcontroller {
    @GetMapping("/hello")
    public String getHello()
    {
        return "Hello Spring";
    }
}


