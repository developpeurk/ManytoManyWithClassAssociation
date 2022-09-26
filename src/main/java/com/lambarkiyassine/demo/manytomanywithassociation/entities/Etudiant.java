package com.lambarkiyassine.demo.manytomanywithassociation.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Etudiant {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    @OneToMany(mappedBy = "etudiant")
    private Collection<Inscription> inscriptions;
}
