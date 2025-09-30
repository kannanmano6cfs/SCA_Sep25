package com.learning.excontdemo.Controller;

import com.learning.excontdemo.Model.Product;
import com.learning.excontdemo.Repository.greetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetController {

    @Autowired
    private greetRepository repo;

    @GetMapping("/")
    public String greet() {
        return "Hello World!! Iam running on Docker desktop!!";
    }

    @PostMapping("/new")
    public ResponseEntity<String> newGreet(@RequestBody Product product) {
        repo.save(product);
        return ResponseEntity.ok("New Product has been saved!");
    }

    @GetMapping("/products")
    public Iterable<Product> getAllProducts() {
        return repo.findAll();
    }
}
