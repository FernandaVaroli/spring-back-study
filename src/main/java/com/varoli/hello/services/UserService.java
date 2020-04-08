package com.varoli.hello.services;

import com.varoli.hello.entities.User;
import com.varoli.hello.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }



    public User findById(Integer id){
        return userRepository.findTeste(id);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
}
