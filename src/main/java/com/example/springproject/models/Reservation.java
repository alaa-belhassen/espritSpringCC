package com.example.springproject.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private String idReservation;
    @Temporal(TemporalType.DATE)
    private Date anneUniversitaire;
    private boolean estValide;

}
