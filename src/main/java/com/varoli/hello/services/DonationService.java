package com.varoli.hello.services;

import com.varoli.hello.entities.Donation;
import com.varoli.hello.repository.DonationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DonationService {
    private DonationRepository donationRepository;

    @Autowired
    public DonationService(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }

    public Donation findById(Integer id){
        Optional<Donation> optionalDonation = donationRepository.findById(id);
        return optionalDonation.get();
    }

    public Donation createDonation(Donation donation){
        return donationRepository.save(donation);
    }

}
