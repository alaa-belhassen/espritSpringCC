package com.example.springproject.controller;

import com.example.springproject.models.Reservation;
import com.example.springproject.service.IReservationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ReservationController {

    IReservationService reservationService;

    @GetMapping("/retrieve-all-reservations")
    public List<Reservation> getReservations() {
        List<Reservation> listReservations = reservationService.retrieveAllReservations();
        return listReservations;

    }

    @GetMapping("/retrieve-reservations/{reservations-id}")
    public Reservation retrieveReservation(@PathVariable("reservations-id") String reservationsId) {
        return reservationService.retrieveReservation(reservationsId);
    }

    @PostMapping("/add-reservations")
    public Reservation addReservation(@RequestBody Reservation e) {
        Reservation reservations = reservationService.addReservation(e);
        return reservations;
    }

    @DeleteMapping("/delete-reservations/{reservations-id}")
    public void removeReservation(@PathVariable("reservations-id") String reservationsId){
        reservationService.removeReservation(reservationsId);
    }

    @PutMapping("/update-reservations")
    public Reservation updateReservation(@RequestBody Reservation e){
        Reservation reservations = reservationService.updateReservation(e);
        return reservations;
    }
}
