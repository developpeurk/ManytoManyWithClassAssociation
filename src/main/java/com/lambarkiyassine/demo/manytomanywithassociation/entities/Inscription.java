package com.lambarkiyassine.demo.manytomanywithassociation.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Inscription {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateInscription;
    private double score;
    @ManyToOne
    private Etudiant etudiant;
    @ManyToOne
    private Cours cours;
}
