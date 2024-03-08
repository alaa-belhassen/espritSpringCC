package com.example.springproject.service.impl;

import com.example.springproject.models.Etudiant;
import com.example.springproject.models.Reservation;
import com.example.springproject.repository.EtudiantRepository;
import com.example.springproject.repository.ReservationRepository;
import com.example.springproject.service.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class EtudiantServiceImpl implements IEtudiantService {

    private EtudiantRepository etudiantRepository;
    private ReservationRepository reservationRepository;
    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).orElse(null);
    }

    @Override
    public void removeEtudiant(Long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }

    @Override
    public List<Etudiant> addEtudiants(List<Etudiant> etudiants) {
        return etudiantRepository.saveAll(etudiants);
    }

    @Override
    public Etudiant findByNomEtAndPrenomEt(String nomEtudiant, String prenomEtudiant) {
        return findByNomEtAndPrenomEt(nomEtudiant, prenomEtudiant);
    }

    @Override
    public Etudiant affecterEtudiantAReservation(String nomEtudiant, String prenomEtudiant, String idReservation) {
        Reservation reservation = reservationRepository.findById(idReservation).get();
        Etudiant etudiant = etudiantRepository.findByNomEtAndPrenomEt(nomEtudiant, prenomEtudiant);
        List<Reservation> reservations = new ArrayList<Reservation>();
        if ( etudiant.getReservations() != null){
            reservations = etudiant.getReservations();
        }
        reservations.add(reservation);
        etudiantRepository.save(etudiant);
        return etudiant;
    }
}
