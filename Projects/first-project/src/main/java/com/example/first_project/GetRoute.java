package com.example.first_project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetRoute {

    @GetMapping("/")
    public String hello(){
        return "Hi, This is Ansh";
    }

    @PostMapping("/post")
    public String Test1(){
        return "testing events 11";
    }
}
