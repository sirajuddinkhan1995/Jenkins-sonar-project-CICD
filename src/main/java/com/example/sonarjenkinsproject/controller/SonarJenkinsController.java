package com.example.sonarjenkinsproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SonarJenkinsController {

    @GetMapping("/integrate")
    public String integrate(){
        return "Sonar and Jenkins are integrated successfully";
    }
}
