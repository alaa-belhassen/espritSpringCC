package com.example.springproject.service;

import com.example.springproject.models.Reservation;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface IReservationService {
    List<Reservation> retrieveAllReservations();
    Reservation addReservation(Reservation e);
    Reservation updateReservation(Reservation e);
    Reservation retrieveReservation(String idReservation);
    void removeReservation(String idReservation);
    List<Reservation> addReservations (List<Reservation> reservations);
    List<Reservation>  findByAnneUniversitaireBetween(LocalDate date_debut, LocalDate date_fin);
}
