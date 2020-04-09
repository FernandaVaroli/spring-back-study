package com.varoli.hello.repository;

import com.varoli.hello.entities.UserPreference;
import org.springframework.data.repository.CrudRepository;

public interface UserPreferenceRepository extends CrudRepository<UserPreference, Integer> {
}
