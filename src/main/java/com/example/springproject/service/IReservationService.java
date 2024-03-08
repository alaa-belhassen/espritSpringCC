package com.example.springproject.service;

import com.example.springproject.models.Reservation;

import java.util.Date;
import java.util.List;

public interface IReservationService {
    List<Reservation> retrieveAllReservations();
    Reservation addReservation(Reservation e);
    Reservation updateReservation(Reservation e);
    Reservation retrieveReservation(String idReservation);
    void removeReservation(String idReservation);
    List<Reservation> addReservations (List<Reservation> reservations);
    List<Reservation>  findByAnneUniversitaireBetween(Date date_debut, Date date_fin);
}
