package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoMessageController {

    @GetMapping("/hi")
    public String greet() {
        return "Hello, how are you?";
    }
}
