package com.example.springproject.repository;

import com.example.springproject.models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.Date;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation,String> {
    List<Reservation> findByAnneUniversitaireBetween(Date date_debut, Date date_fin);
}
