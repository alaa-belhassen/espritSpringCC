package com.example.springproject.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;

@Entity
public class Bloc implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idBloc;
    private String nomBloc;
    private long capaciteBloc;
    @OneToMany(mappedBy = "bloc")
    private ArrayList<Chambre> chambre;
    @ManyToOne
    private Foyer foyer;
}
