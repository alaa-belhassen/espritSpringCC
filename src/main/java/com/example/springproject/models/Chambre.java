package com.example.springproject.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;

@Entity
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idChambre;
    private long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeC typechambre;

    @OneToMany
    private ArrayList<Reservation> reservations;

    @ManyToOne
    private Bloc bloc;

}
