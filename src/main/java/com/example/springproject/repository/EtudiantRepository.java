package com.example.springproject.repository;

import com.example.springproject.models.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    Etudiant findByNomEtAndPrenomEt(String nomEtudiant,String prenomEtudiant);
}
