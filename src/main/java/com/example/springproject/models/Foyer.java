package com.example.springproject.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idFoyer;
    private long capaciteFoyer;
    private String nomFoyer;
    @OneToMany(mappedBy="foyer")
    private List<Bloc> blocs;
    @OneToOne(mappedBy ="foyer")
    private Universite universite;
}
