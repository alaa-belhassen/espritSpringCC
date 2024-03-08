package com.example.springproject.service;

import com.example.springproject.models.Bloc;
import com.example.springproject.models.Chambre;

import java.util.List;

public interface IBlocService {

    List<Bloc> retrieveAllBlocs();
    Bloc addBloc(Bloc f);
    Bloc updateBloc(Bloc f);
    Bloc retrieveBloc(Long idBloc);
    void removeBloc(Long idBloc);
    List<Bloc> addBlocs (List<Bloc> foyer);

    Bloc findByNomBloc(String nomBloc);
    Bloc affecterChambresABloc(List<Long> numChambre,String nomBloc);
    List<Chambre> findByBlocNomBloc(String nomBloc);

}
