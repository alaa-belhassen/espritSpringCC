package com.example.springproject.controller;



import com.example.springproject.models.Etudiant;
import com.example.springproject.service.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantController {

    IEtudiantService etudiantServiceImpl;

    @GetMapping("/retrieve-all-etudiants")
    public List<Etudiant> getEtudiants() {
        List<Etudiant> listEtudiants = etudiantServiceImpl.retrieveAllEtudiants();
        return listEtudiants;

    }

    @GetMapping("/retrieve-etudiant/{etudiant-id}")
    public Etudiant retrieveEtudiant(@PathVariable("etudiant-id") Long etudiantId) {
        return etudiantServiceImpl.retrieveEtudiant(etudiantId);
    }

    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant = etudiantServiceImpl.addEtudiant(e);
        return etudiant;
    }

    @DeleteMapping("/delete-etudiant/{etudiant-id}")
    public void removeEtudiant(@PathVariable("etudiant-id") Long etudiantId){
        etudiantServiceImpl.removeEtudiant(etudiantId);
    }

    @PutMapping("/update-etudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant e){
        Etudiant etudiant = etudiantServiceImpl.updateEtudiant(e);
        return etudiant;
    }
    @PutMapping("/affecterEtudiantReservation")
    public Etudiant affecterEtudiantAReservation(String nomEtudiant, String prenomEtudiant, String idReservation) {
         return etudiantServiceImpl.affecterEtudiantAReservation(nomEtudiant, prenomEtudiant, idReservation);
    }

}