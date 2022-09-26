package com.lambarkiyassine.demo.manytomanywithassociation.repositories;

import com.lambarkiyassine.demo.manytomanywithassociation.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}
