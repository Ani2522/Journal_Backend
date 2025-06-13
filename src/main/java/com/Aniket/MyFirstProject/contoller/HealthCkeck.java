package com.Aniket.MyFirstProject.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCkeck {
    @GetMapping("/health-check")
    public String healthCheck(){
        return "Ok";
    }
}
