package com.example.springproject.controller;

import com.example.springproject.models.Reservation;
import com.example.springproject.service.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
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

    @GetMapping("/retrieve-reservations-bydate")
    @ResponseBody
    public List<Reservation> retrieveReservationByDate(@RequestParam   LocalDate dateDebut, @RequestParam   LocalDate dateFin) {
        return reservationService.findByAnneUniversitaireBetween(dateDebut,dateFin);
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
