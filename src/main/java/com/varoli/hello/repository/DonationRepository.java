package com.varoli.hello.repository;

import com.varoli.hello.entities.Donation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DonationRepository extends CrudRepository<Donation, Integer> {
    List<Donation> findAllByUserId(Integer userId);

}
