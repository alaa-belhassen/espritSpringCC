package com.example.springproject.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;

@Entity
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idFoyer;
    private String nomFoyer;
    private long capaciteFoyer;
    @OneToMany(mappedBy="foyer")
    private ArrayList<Bloc> blocs;
    @OneToOne
    private Universite universite;
}
