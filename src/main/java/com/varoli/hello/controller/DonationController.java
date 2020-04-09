package com.varoli.hello.controller;

import com.varoli.hello.entities.Donation;
import com.varoli.hello.services.DonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/donation")
public class DonationController {
    private DonationService donationService;

    @Autowired
    public DonationController(DonationService donationService) {
        this.donationService = donationService;
    }

    @GetMapping("/{id}")
    public Donation findById(@PathVariable Integer id){
        return donationService.findById(id);
    }

    @PostMapping("/")
    public Donation createDonation(@RequestBody Donation donation){
        return donationService.createDonation(donation);
    }

    @GetMapping("/user/{userId}")
    public List<Donation> getDonationByUser(@PathVariable Integer userId){
        return donationService.findAllByUserId(userId);
    }

}
