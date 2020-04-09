package com.varoli.hello.controller;

import com.varoli.hello.entities.UserPreference;
import com.varoli.hello.services.UserPreferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/userPreference")
public class UserPreferenceController {
    private UserPreferenceService userPreferenceService;

    @Autowired
    public UserPreferenceController(UserPreferenceService userPreferenceService) {
        this.userPreferenceService = userPreferenceService;
    }

    @GetMapping("/{id}")
    public UserPreference findById(@PathVariable Integer id){
        return userPreferenceService.findById(id);
    }

    @PostMapping("/")
    public UserPreference createPreference(@RequestBody UserPreference userPreference){
        return userPreferenceService.createPreference(userPreference);
    }

}
