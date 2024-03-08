package com.example.springproject.service.impl;

import com.example.springproject.models.Foyer;
import com.example.springproject.models.Universite;
import com.example.springproject.repository.FoyerRepository;
import com.example.springproject.repository.UniversiteRepository;
import com.example.springproject.service.IUniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService {
    private UniversiteRepository universiteRepository;
    private FoyerRepository foyerRepository;

    @Override
    public List<Universite> retrieveAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite addUniversite(Universite e) {
        return universiteRepository.save(e);
    }

    @Override
    public Universite updateUniversite(Universite e) {
        return universiteRepository.save(e);
    }

    @Override
    public Universite retrieveUniversite(Long idUniversite) {
        return universiteRepository.findById(idUniversite).orElse(null);
    }

    @Override
    public void removeUniversite(Long idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }

    @Override
    public List<Universite> addUniversites(List<Universite> etudiants) {
        return universiteRepository.saveAll(etudiants);
    }



    @Override
    public Universite findByNomUniversite(String nomUniversite) {
        return universiteRepository.findByNomUniversite(nomUniversite);
    }

    @Override
    public Universite affecterFoyerAUniversite(Long idFoyer, String nomUniversite) {
        Foyer foyer = foyerRepository.findById(idFoyer).get();
        Universite universite = universiteRepository.findByNomUniversite(nomUniversite);
        universite.setFoyer(foyer);
        return universiteRepository.save(universite);
    }

    @Override
    public Long desaffecterFoyerAUniversite(Long idFoyer) {
        Foyer foyer = foyerRepository.findById(idFoyer).get();
        foyer.setUniversite(null);
        foyerRepository.save(foyer);
        return idFoyer;
    }
}
