package com.example.springproject.service.impl;

import com.example.springproject.models.Bloc;
import com.example.springproject.models.Chambre;
import com.example.springproject.repository.BlocRepository;
import com.example.springproject.repository.ChambreRepository;
import com.example.springproject.repository.UniversiteRepository;
import com.example.springproject.service.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class BlocServiceImpl implements IBlocService {
    private BlocRepository blocRepository;
    private ChambreRepository chambreRepository;
    @Override
    public List<Bloc> retrieveAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc addBloc(Bloc e) {
        return blocRepository.save(e);
    }

    @Override
    public Bloc updateBloc(Bloc e) {
        return blocRepository.save(e);
    }

    @Override
    public Bloc retrieveBloc(Long idBloc) {
        return blocRepository.findById(idBloc).orElse(null);
    }

    @Override
    public void removeBloc(Long idBloc) {
        blocRepository.deleteById(idBloc);
    }

    @Override
    public List<Bloc> addBlocs(List<Bloc> etudiants) {
        return blocRepository.saveAll(etudiants);
    }

    @Override
    public Bloc findByNomBloc(String nomBloc) {
        return blocRepository.findByNomBloc(nomBloc);
    }

    @Override
    public Bloc affecterChambresABloc(List<Long> numChambre, String nomBloc) {
        Bloc bloc = blocRepository.findByNomBloc(nomBloc);
        numChambre.stream().forEach(chambreNum->{
            Chambre c = chambreRepository.findById(chambreNum).get();
            c.setBloc(bloc);
            chambreRepository.save(c);
        });
        return bloc;
    }

    @Override
    public List<Chambre> findByBlocNomBloc(String nomBloc) {
        return findByBlocNomBloc(nomBloc);
    }


}
