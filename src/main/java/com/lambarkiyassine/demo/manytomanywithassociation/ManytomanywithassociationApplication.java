package com.lambarkiyassine.demo.manytomanywithassociation;

import com.lambarkiyassine.demo.manytomanywithassociation.entities.Cours;
import com.lambarkiyassine.demo.manytomanywithassociation.entities.Etudiant;
import com.lambarkiyassine.demo.manytomanywithassociation.entities.Inscription;
import com.lambarkiyassine.demo.manytomanywithassociation.repositories.CoursRepository;
import com.lambarkiyassine.demo.manytomanywithassociation.repositories.EtudiantRepository;
import com.lambarkiyassine.demo.manytomanywithassociation.repositories.InscriptionRepository;
import com.lambarkiyassine.demo.manytomanywithassociation.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DateFormat;
import java.util.Date;

@SpringBootApplication
public class ManytomanywithassociationApplication implements CommandLineRunner  {

   @Autowired
    CoursRepository coursRepository;
   @Autowired
    InscriptionRepository inscriptionRepository;
   @Autowired
    EtudiantRepository etudiantRepository;
    @Autowired
   private EtudiantService etudiantService;
    @Autowired
   private CoursService coursService;
    @Autowired
   private InscriptionService inscriptionService;

    public static void main(String[] args) {
        SpringApplication.run(ManytomanywithassociationApplication.class, args);
    }



    @Override
    public void run(String... args) throws Exception {
        etudiantService.saveEtudiant(new Etudiant(null, "Yazidi", "Mohamed", null));
        etudiantService.saveEtudiant(new Etudiant(null, "Naji", "Amina", null));
        coursService.saveCours(new Cours(null,"MATH",40, null));
        coursService.saveCours(new Cours(null,"Base de données",40, null));

        Cours cours1 = coursRepository.findById(1L).get();
        Etudiant et1 = etudiantRepository.findById(1L).get();
        Cours cours2 = coursRepository.findById(2L).get();
        Etudiant et2 = etudiantRepository.findById(2L).get();

        inscriptionService.saveInscription(new Inscription(null, new Date(), 14, et1, cours1));
        inscriptionService.saveInscription(new Inscription(null, new Date(), 12, et1, cours2));
        inscriptionService.saveInscription(new Inscription(null, new Date(), 18, et2, cours1));
        inscriptionService.saveInscription(new Inscription(null, new Date(), 11, et2, cours2));

        Cours coursBd = coursRepository.findById(2L).get();
        System.out.println("**************************");
        System.out.println("ID cours: " + coursBd.getId());
        System.out.println("Nom cours: " + coursBd.getNom());
        System.out.println("Inscriptions ");
        System.out.println("ID\tDate Inscricr\tNom \tPrénom\tScore\t ");
        inscriptionRepository.findByCours(coursBd).forEach(insc->{
            System.out.println("-----------------------------------------");
            System.out.print(insc.getId()+"\t");
            System.out.print(DateFormat.getDateInstance(DateFormat.MEDIUM).format(insc.getDateInscription()) + "\t");
            System.out.print(insc.getEtudiant().getNom()+"\t");
            System.out.print(insc.getEtudiant().getPrenom()+"\t");
            System.out.println(insc.getScore());
        });
        System.out.println("-----------------------------------------");
    }
}
