package com.varoli.hello.services;


import com.varoli.hello.entities.Ong;
import com.varoli.hello.entities.User;
import com.varoli.hello.repository.OngRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class OngService {
    private OngRepository ongRepository;

    @Autowired
    public OngService(OngRepository ongRepository) {
        this.ongRepository = ongRepository;
    }

    public Ong findById(Integer id){
        Optional<Ong> optionalOng = ongRepository.findById(id);
        return optionalOng.get();
    }

    public Ong createOng(Ong ong){
        return ongRepository.save(ong);
    }
}
