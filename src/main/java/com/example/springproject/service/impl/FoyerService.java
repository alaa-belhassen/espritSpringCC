package com.example.springproject.service.impl;

import com.example.springproject.models.Foyer;
import com.example.springproject.models.Universite;
import com.example.springproject.repository.BlocRepository;
import com.example.springproject.repository.FoyerRepository;
import com.example.springproject.repository.UniversiteRepository;
import com.example.springproject.service.IFoyerService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerService implements IFoyerService {
    private FoyerRepository foyerRepository;
    private UniversiteRepository universiteRepository;
    private final BlocRepository blocRepository;

    @Override
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer e) {
        return foyerRepository.save(e);
    }

    @Override
    public Foyer updateFoyer(Foyer e) {
        return foyerRepository.save(e);
    }

    @Override
    public Foyer retrieveFoyer(Long idFoyer) {
        return foyerRepository.findById(idFoyer).orElse(null);
    }

    @Override
    public void removeFoyer(Long idFoyer) {
        foyerRepository.deleteById(idFoyer);
    }

    @Override
    public List<Foyer> addFoyers(List<Foyer> etudiants) {
        return foyerRepository.saveAll(etudiants);
    }

    @Override
    public Foyer addFoyerWithBloc(Foyer foyer) {
        Foyer foyer1 = foyerRepository.save(foyer);
        foyer.getBlocs().forEach(bloc  ->{
            bloc.setFoyer(foyer1);
            blocRepository.save(bloc);
        });

        return foyer;
    }


}
