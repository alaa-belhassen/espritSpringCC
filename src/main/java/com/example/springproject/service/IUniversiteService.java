package com.example.springproject.service;

import com.example.springproject.models.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite> retrieveAllUniversites();
    Universite addUniversite(Universite u);
    Universite updateUniversite(Universite u);
    Universite retrieveUniversite(Long idUniversite);
    void removeUniversite(Long idUniversite);
    List<Universite> addUniversites (List<Universite> foyer);
    Universite findByNomUniversite(String nomUniversite);
    Universite affecterFoyerAUniversite(Long idFoyer,String nomUniversite);
    Long desaffecterFoyerAUniversite(Long idFoyer);

}
