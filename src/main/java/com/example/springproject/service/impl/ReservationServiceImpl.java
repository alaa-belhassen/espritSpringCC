package com.example.springproject.service.impl;

import com.example.springproject.models.Reservation;
import com.example.springproject.repository.ReservationRepository;
import com.example.springproject.service.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Service
public class ReservationServiceImpl implements IReservationService {
    private ReservationRepository etudiantRepository;


    @Override
    public List<Reservation> retrieveAllReservations() {
        return etudiantRepository.findAll();
    }

    @Override
    public Reservation addReservation(Reservation e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Reservation updateReservation(Reservation e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return etudiantRepository.findById(idReservation).orElse(null);
    }

    @Override
    public void removeReservation(String idReservation) {
        etudiantRepository.deleteById(idReservation);
    }

    @Override
    public List<Reservation> addReservations(List<Reservation> etudiants) {
        return etudiantRepository.saveAll(etudiants);
    }

    @Override
    public List<Reservation> findByAnneUniversitaireBetween(Date date_debut, Date date_fin) {
        return findByAnneUniversitaireBetween(date_debut,date_fin);
    }
}
