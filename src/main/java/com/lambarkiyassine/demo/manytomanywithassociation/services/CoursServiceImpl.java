package com.lambarkiyassine.demo.manytomanywithassociation.services;


import com.lambarkiyassine.demo.manytomanywithassociation.entities.Cours;
import com.lambarkiyassine.demo.manytomanywithassociation.repositories.CoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CoursServiceImpl implements CoursService{
    @Autowired
    private CoursRepository coursRepository;


    @Override
    public void saveCours(Cours cours) {
        coursRepository.save(cours);
    }

}
