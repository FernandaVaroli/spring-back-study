package com.varoli.hello.services;

import com.varoli.hello.entities.UserPreference;
import com.varoli.hello.repository.UserPreferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserPreferenceService {
    private UserPreferenceRepository userPreferenceRepository;

    @Autowired
    public UserPreferenceService(UserPreferenceRepository userPreferenceRepository) {
        this.userPreferenceRepository = userPreferenceRepository;
    }

    public UserPreference findById(Integer id){
        Optional<UserPreference> optionalUserPreference = userPreferenceRepository.findById(id);
        return optionalUserPreference.get();
    }

    public UserPreference createPreference(UserPreference userPreference){
        return userPreferenceRepository.save(userPreference);
    }
}
