package com.lambarkiyassine.demo.manytomanywithassociation.repositories;

import com.lambarkiyassine.demo.manytomanywithassociation.entities.Cours;
import com.lambarkiyassine.demo.manytomanywithassociation.entities.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InscriptionRepository extends JpaRepository<Inscription,Long> {
    List<Inscription> findByCours(Cours cours);
}
