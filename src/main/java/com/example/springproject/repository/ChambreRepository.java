package com.example.springproject.repository;

import com.example.springproject.models.Chambre;
import com.example.springproject.models.TypeC;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    List<Chambre> findByBlocNomBloc(String nomBloc);
    List<Chambre> findAllByBlocNomBlocAndTypechambre(String nomBloc, TypeC type);

}
