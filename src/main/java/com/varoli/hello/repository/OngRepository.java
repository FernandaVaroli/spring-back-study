package com.varoli.hello.repository;

import com.varoli.hello.entities.Ong;
import org.springframework.data.repository.CrudRepository;


public interface OngRepository extends CrudRepository<Ong, Integer> {

}
