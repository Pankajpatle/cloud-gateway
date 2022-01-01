package com.codeProject.coloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/userServiceFallback")
    public String userServiceFallbackMethod(){
        return "User service taking longer time than Expected."+
                "Please Try again later";
    }

    @GetMapping("/departServiceFallback")
    public String departServiceFallbackMethod(){
        return "Department service taking longer time than Expected."+
                "Please Try again later";
    }
}
