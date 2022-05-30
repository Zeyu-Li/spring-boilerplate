package com.example.boilerplate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/healthcheck")
@RestController
public class IndexController {

    @GetMapping
    public String healthCheck() {
        return "All systems online!";
    }
}
