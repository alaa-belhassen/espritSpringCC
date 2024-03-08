package com.example.springproject.service.impl;

import com.example.springproject.models.Chambre;
import com.example.springproject.models.TypeC;
import com.example.springproject.repository.ChambreRepository;
import com.example.springproject.repository.UniversiteRepository;
import com.example.springproject.service.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ChambreServiceImpl implements IChambreService {

    private ChambreRepository chambreRepository;
    @Override
    public List<Chambre> retrieveAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre e) {
        return chambreRepository.save(e);
    }

    @Override
    public Chambre updateChambre(Chambre e) {
        return chambreRepository.save(e);
    }

    @Override
    public Chambre retrieveChambre(Long idChambre) {
        return chambreRepository.findById(idChambre).orElse(null);
    }

    @Override
    public void removeChambre(Long idChambre) {
        chambreRepository.deleteById(idChambre);
    }

    @Override
    public List<Chambre> addChambres(List<Chambre> etudiants) {
        return chambreRepository.saveAll(etudiants);
    }

    @Override
    public List<Chambre> getChmabresParNomBloc(String nomBloc) {

        return chambreRepository.findByBlocNomBloc(nomBloc);
    }

    @Override
    public int nbrFindAllByBlocNomBlocAndTypechambre(String nomBloc, TypeC type) {
        return chambreRepository.findAllByBlocNomBlocAndTypechambre(nomBloc, type).size();
    }


}
