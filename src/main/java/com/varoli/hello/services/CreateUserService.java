package com.varoli.hello.services;


import com.varoli.hello.entities.Ong;
import com.varoli.hello.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CreateUserService {
    private UserService userService;
    private OngService ongService;

    @Autowired
    public CreateUserService(UserService userService, OngService ongService) {
        this.userService = userService;
        this.ongService = ongService;
    }

    public User createUser(User user){
        Set<Ong> ongs = new HashSet<>();

        for (Ong ong : user.getOngs()){
            ongs.add(ongService.findById(ong.getId()));
        }
        user.setOngs(ongs);

        return userService.createUser(user);
    }
}
