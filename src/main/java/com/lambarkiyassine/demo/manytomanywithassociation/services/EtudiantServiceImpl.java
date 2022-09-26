package com.lambarkiyassine.demo.manytomanywithassociation.services;


import com.lambarkiyassine.demo.manytomanywithassociation.entities.Etudiant;
import com.lambarkiyassine.demo.manytomanywithassociation.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EtudiantServiceImpl implements EtudiantService{
    @Autowired
    private EtudiantRepository etudiantRepository;


    @Override
    public void saveEtudiant(Etudiant etudiant) {
        etudiantRepository.save(etudiant);
    }

}
