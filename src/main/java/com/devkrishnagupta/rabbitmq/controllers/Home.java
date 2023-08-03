package com.devkrishnagupta.rabbitmq.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class Home {

    @GetMapping("/test")
    public String test(){
        return "It's Working fine!";
    }
}
