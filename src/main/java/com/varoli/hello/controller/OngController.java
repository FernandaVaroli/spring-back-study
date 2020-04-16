package com.varoli.hello.controller;



import com.varoli.hello.entities.Ong;

import com.varoli.hello.services.OngService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/ongs")
public class OngController {
    private OngService ongService;

    @Autowired
    public OngController(OngService ongService) {
        this.ongService = ongService;
    }

    @GetMapping("/{id}")
    public Ong findById(@PathVariable Integer id){
        return ongService.findById(id);
    }

    @PostMapping("/")
    public Ong createOng(@RequestBody Ong ong){
        return ongService.createOng(ong);
    }
}
