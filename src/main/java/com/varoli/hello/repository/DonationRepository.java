package com.varoli.hello.repository;

import com.varoli.hello.entities.Donation;
import org.springframework.data.repository.CrudRepository;

public interface DonationRepository extends CrudRepository<Donation, Integer> {

}
