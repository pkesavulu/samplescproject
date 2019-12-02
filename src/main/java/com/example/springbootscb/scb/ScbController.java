package com.example.springbootscb.scb;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScbController {


    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
