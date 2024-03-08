package com.example.springproject.repository;

import com.example.springproject.models.Foyer;
import com.example.springproject.models.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoyerRepository extends JpaRepository<Foyer,Long> {
}
