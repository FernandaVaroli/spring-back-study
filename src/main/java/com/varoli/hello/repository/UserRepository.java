package com.varoli.hello.repository;

import com.varoli.hello.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends Repository<User, Integer> {
    User findById(Integer id);

    User save(User user);

    @Query(value = "select * from users where id = :id", nativeQuery = true)
    User findTeste(@Param("id") Integer id);

    User findByNameAndUsername(String name, String username);
}
