package com.devsecops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HomeController {
    
    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "UP", "service", "DevSecOps Practice App");
    }
    
    @GetMapping("/info")
    public Map<String, String> info() {
        return Map.of(
            "name", "DevSecOps Practice Application",
            "version", "1.0.0",
            "description", "A simple Spring Boot app for practicing DevSecOps"
        );
    }
    
    @GetMapping("/welcome")
    public Map<String, String> welcome() {
        return Map.of("message", "Welcome to DevSecOps Practice!");
    }
    
    @GetMapping("/")
    public Map<String, String> home() {
        return Map.of("message", "DevSecOps Practice Application is running!");
    }
}