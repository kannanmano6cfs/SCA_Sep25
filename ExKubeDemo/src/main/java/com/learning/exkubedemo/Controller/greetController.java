package com.learning.exkubedemo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetController {


    @GetMapping("/")
    public String greet() {
        return "Hello World!! Iam running on Pods in Kubernetes!!";
    }

}
