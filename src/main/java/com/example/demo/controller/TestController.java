package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test") // url 지정하는 어노테이션
public class TestController {
    @GetMapping("/testGetMapping")  // localhost:8080/test/testGetMapping
    public String testContoller() {
        return "Hello World, 홍정민";
    }

    @GetMapping("/{id}")
    public String testControllerWithPathVariables(@PathVariable(required = false) int id) {
        return "Hello World! ID " + id;
    }
}
