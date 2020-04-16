package com.varoli.hello.controller;

import com.varoli.hello.entities.User;
import com.varoli.hello.services.CreateUserService;
import com.varoli.hello.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping (path = "/users")
public class UserController {
    private UserService userService;
    private CreateUserService createUserService;

    @Autowired
    public UserController(UserService userService, CreateUserService createUserService) {
        this.userService = userService;
        this.createUserService = createUserService;
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable Integer id){

        return userService.findById(id);
    }

    @PostMapping("/")
    public User createUser(@RequestBody User user){
        return createUserService.createUser(user);
    }
}
