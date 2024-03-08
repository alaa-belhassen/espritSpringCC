package com.example.springproject.controller;


import com.example.springproject.models.Universite;
import com.example.springproject.service.IUniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteController {
    IUniversiteService universiteService;
    @PutMapping("/affecterUniversite/{idFoyer}/{nomUniversite}")
    public Universite affecterUniversite(@PathVariable("idFoyer") Long idFoyer, @PathVariable("nomUniversite") String nomUniversite){
        return universiteService.affecterFoyerAUniversite(idFoyer,nomUniversite);
    }
    @PutMapping("/desafecterUniversite/{idFoyer}")
    public Long desaffecterUniversite(@PathVariable("idFoyer") Long idFoyer){
        return universiteService.desaffecterFoyerAUniversite(idFoyer);
    }

    @GetMapping("/retrieve-all-universite")
    public List<Universite> getUniversites() {
        List<Universite> listUniversites = universiteService.retrieveAllUniversites();
        return listUniversites;

    }

    @GetMapping("/retrieve-universite/{universite-id}")
    public Universite retrieveUniversite(@PathVariable("universite-id") Long universiteId) {
        return universiteService.retrieveUniversite(universiteId);
    }

    @PostMapping("/&")
    public Universite addUniversite(@RequestBody Universite e) {
        Universite universite = universiteService.addUniversite(e);
        return universite;
    }

    @DeleteMapping("/delete-universite/{universite-id}")
    public void removeUniversite(@PathVariable("universite-id") Long universiteId){
        universiteService.removeUniversite(universiteId);
    }

    @PutMapping("/update-universite")
    public Universite updateUniversite(@RequestBody Universite e){
        Universite universite = universiteService.updateUniversite(e);
        return universite;
    }


}
