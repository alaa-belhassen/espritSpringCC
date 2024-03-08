package com.example.springproject.service;

import com.example.springproject.models.Chambre;
import com.example.springproject.models.TypeC;

import java.util.List;

public interface IChambreService {

    List<Chambre> retrieveAllChambres();
    Chambre addChambre(Chambre f);
    Chambre updateChambre(Chambre f);
    Chambre retrieveChambre(Long idChambre);
    void removeChambre(Long idChambre);
    List<Chambre> addChambres (List<Chambre> foyer);
    List<Chambre> getChmabresParNomBloc(String nomBloc);
    int nbrFindAllByBlocNomBlocAndTypechambre(String nomBloc, TypeC type);

}
