package com.varoli.hello.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServices {

    public String greet(String name){
        return "Hello, "+ name;
    }
}
