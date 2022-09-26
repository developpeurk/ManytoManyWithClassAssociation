package com.lambarkiyassine.demo.manytomanywithassociation.repositories;

import com.lambarkiyassine.demo.manytomanywithassociation.entities.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursRepository extends JpaRepository<Cours, Long> {
}
