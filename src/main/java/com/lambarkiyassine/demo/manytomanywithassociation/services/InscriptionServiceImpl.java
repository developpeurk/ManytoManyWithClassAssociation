package com.lambarkiyassine.demo.manytomanywithassociation.services;


import com.lambarkiyassine.demo.manytomanywithassociation.entities.Inscription;
import com.lambarkiyassine.demo.manytomanywithassociation.repositories.InscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class InscriptionServiceImpl implements InscriptionService{
    @Autowired
    private InscriptionRepository inscriptionRepository;


    @Override
    public void saveInscription(Inscription inscription) {
        inscriptionRepository.save(inscription);
    }

}
