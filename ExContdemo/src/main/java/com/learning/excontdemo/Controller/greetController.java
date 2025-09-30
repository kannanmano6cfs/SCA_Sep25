package com.learning.excontdemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetController {

    @GetMapping("/")
    public String greet() {
        return "Hello World!! Iam running on Docker desktop!!";
    }
}
