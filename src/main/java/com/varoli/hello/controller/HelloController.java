package com.varoli.hello.controller;

import com.varoli.hello.dto.HelloDTO;
import com.varoli.hello.dto.NameDTO;
import com.varoli.hello.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/teste")
public class HelloController {
    private GreetingServices greetingServices;

    @Autowired
    public HelloController(GreetingServices greetingServices){
        this.greetingServices = greetingServices;
    }


    @PostMapping ("/hello")
    public HelloDTO hello(@RequestBody NameDTO name){

        String greeting = greetingServices.greet(name.getName());
        return new HelloDTO(greeting);
    }
}
