package com.example.springproject.service;

import com.example.springproject.models.Foyer;
import com.example.springproject.models.Universite;

import java.util.List;

public interface IFoyerService {
    List<Foyer> retrieveAllFoyers();
    Foyer addFoyer(Foyer f);
    Foyer updateFoyer(Foyer f);
    Foyer retrieveFoyer(Long idFoyer);
    void removeFoyer(Long idFoyer);
    List<Foyer> addFoyers (List<Foyer> foyer);
    Foyer addFoyerWithBloc(Foyer foyer);
}
