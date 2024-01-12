package com.example.springproject.models;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idChambre;
    private long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeC typechambre;

}
