package com.example.springproject.service;

import com.example.springproject.models.Etudiant;

import java.util.List;

public interface IEtudiantService {
    List<Etudiant> retrieveAllEtudiants();
    Etudiant addEtudiant(Etudiant e);
    Etudiant updateEtudiant(Etudiant e);
    Etudiant retrieveEtudiant(Long idEtudiant);
    void removeEtudiant(Long idEtudiant);
    List<Etudiant> addEtudiants (List<Etudiant> etudiants);
    Etudiant findByNomEtAndPrenomEt(String nomEtudiant,String prenomEtudiant);
    Etudiant affecterEtudiantAReservation(String nomEtudiant,String prenomEtudiant,String idReservation);

}
