package com.varoli.hello.services;

import com.varoli.hello.entities.Ong;
import com.varoli.hello.entities.User;
import com.varoli.hello.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

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
       /* Set<Ong> ongs = user.getOngs();

        for (Ong ong: ongs) {
            ong.getUsers().add(user);
        }*/
        return userRepository.save(user);
    }
}
